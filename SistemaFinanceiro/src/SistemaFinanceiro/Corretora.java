// Autor: Juan Carlos Cardoso de Oliveira.
// Autor: Gabriel Haruki Gomes Satô.
package SistemaFinanceiro;

public class Corretora {
    
    // Declaração dos atributos da corretora.
    int bitcoin;
    int preco;
        
    public Corretora() {
        this.bitcoin = 100;
        this.preco = 1000;
    }
    
    // Função que retorna o preço do bitcoin.
    public int getPreco() {
        return preco;
    }

    // Função que determina valor do bitcoin.
    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    // Função para compra de bitcoins por parte da corretora.
    public synchronized void comprar() throws InterruptedException {        
        // Mostra no sistema a operação da compra de bitcoins.
        System.out.println("A corretora compra bitcoins.");
        // Ao comprar bitcoins, a quantidade que a corretora possui aumenta.
        this.bitcoin++;
        // Devido a corretora comprar bitcoins, seu valor diminui.
        this.setPreco(this.getPreco() - 1000);
        // Descansa a thread.
        Thread.sleep(4000);
        notifyAll();
    }
    
    // Função para venda de bitcoins por parte da corretora.
    public synchronized void vender() throws InterruptedException { 
        // Mostra no sistema a operação da venda de bitcoins.
        System.out.println("A corretora vende bitcoins.");
        // Ao vender bitcoins, a quantidade que a corretora possui diminui.
        this.bitcoin--;
        // Devido a corretora vender bitcoins, seu valor aumenta.
        this.setPreco(this.getPreco() + 1000);
        // Descansa a thread.
        Thread.sleep(4000);
        notifyAll();
    } 
}
