// Autor: Juan Carlos Cardoso de Oliveira.
// Autor: Gabriel Haruki Gomes Satô.
package SistemaFinanceiro;

public class Transacoes {

    public static void main(String[] args) {
        // Cria o objeto da corretora.
        Corretora cor = new Corretora();        
        // Cria dois investidores para comprar bitcoins.
        Investidor inv1 = new Investidor(cor, "JUAN OLIVEIRA");
        Investidor inv2 = new Investidor(cor, "GABRIEL HARUKI");
        // Inicia as transações dos investidores
        inv1.start();
        inv2.start();
    }
}
