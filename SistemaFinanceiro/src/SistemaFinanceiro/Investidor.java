// Autor: Juan Carlos Cardoso de Oliveira.
// Autor: Gabriel Haruki Gomes Satô.
package SistemaFinanceiro;

public class Investidor extends Thread {
    
    // Declaração dos atributos do investidor.
    int capital;
    int carteiraBitcoin;
    Corretora corretor;
    String nome;

    public Investidor(Corretora corretora, String nome) {
        this.corretor = corretora;
        this.capital = 1000000;
        this.carteiraBitcoin = 0;
        this.nome = nome;
    }

    public void comprar() throws InterruptedException {
        System.out.println("Investidor " + this.nome + " vai comprar bitcoins");
        // Para o investidor comprar bitcoins a corretora deve vender.
        this.corretor.vender();
        // Ao comprar bitcoins, o capital do investidor diminui com relação ao preço do bitcoin.
        this.capital -= corretor.getPreco();
        // Após a compra, a quantidade de bitcoins em sua carteira aumenta.
        this.carteiraBitcoin++;
        // Devido ao investimento no bitcoin, seu valor aumenta.
        corretor.setPreco(corretor.getPreco() + 1000);
        // Mostra no sistema as operações.
        System.out.println("Investidor " + this.nome + " comprou bitcoins");
        System.out.println("Investidor " + this.nome + " tem " + this.carteiraBitcoin + " bitcoins");
        System.out.println("Investidor " + this.nome + " tem " + this.capital + " de capital");
    }

    public void vender() throws InterruptedException {
        System.out.println("Investidor " + this.nome + " vai vender bitcoins");
        // Para o investidor vender bitcoins a corretora deve comprar.
        this.corretor.comprar();
        // Ao vender bitcoins, o capital do investidor aumenta com relação ao preço do bitcoin.
        this.capital += corretor.getPreco();
        // Após a venda, a quantidade de bitcoins em sua carteira diminui.
        this.carteiraBitcoin--;
        // Devido ao não-investimento no bitcoin, seu valor diminui.
        corretor.setPreco(corretor.getPreco() - 1000);
        // Mostra no sistema as operações.
        System.out.println("Investidor " + this.nome + " vendeu bitcoins");
        System.out.println("Investidor " + this.nome + " tem " + this.carteiraBitcoin + " bitcoins");
        System.out.println("Investidor " + this.nome + " tem " + this.capital + " de capital");
    }

    @Override
    public void run() {
        // Caso o investidor não possua bitcoins ele compra.
        if (this.carteiraBitcoin == 0) {
            // Se o capital de investidor for maior que o preço do bitcoin ele pode comprar.
            if (this.capital >= this.corretor.getPreco()) {
                try {
                    this.comprar();
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
