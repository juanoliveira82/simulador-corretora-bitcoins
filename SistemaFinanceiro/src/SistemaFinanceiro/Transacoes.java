// Autor: Juan Carlos Cardoso de Oliveira.
// Autor: Gabriel Haruki Gomes Satô.
package SistemaFinanceiro;

public class Transacoes {

    public static void main(String[] args) {
        // Cria o objeto da corretora.
        Corretora cor = new Corretora();        
        // Cria dois investidores para comprar bitcoins.
        Investidor inv1 = new Investidor(cor, "LUCIANO DO YOUTUBE");
        Investidor inv2 = new Investidor(cor, "MC ZOI DE GATO");
        // Inicia as transações dos investidores
        inv1.start();
        inv2.start();
    }
}
