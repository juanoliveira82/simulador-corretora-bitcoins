package SistemaFinanceiro;

// @author Juan Oliveira

public class Corretora {
    
    int bitcoin;
        
    public Corretora() {
        bitcoin = 100;
    }
    
    public void comprar(int qtd) { // depositar
        // Corretora comprou bitcoins, ao comprar, soma a quantidade comprada a quantia em carteira.
        bitcoin = bitcoin + qtd;        
    }
    
    public void vender(int qtd) {
        // Corretora vendeu bitcoins, ao vender, diminui a quantidade vendida da quantia em carteira.
        bitcoin = bitcoin - qtd;
    }
    
}
