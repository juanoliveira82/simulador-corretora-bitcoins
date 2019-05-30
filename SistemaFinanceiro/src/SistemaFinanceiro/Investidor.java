package SistemaFinanceiro;

// @author Juan Oliveira

import java.util.Random;


public class Investidor extends Thread {
        
    int capitalInicial;
    int carteiraBitcoin;
    Corretora buffer;    
    
    public Investidor() {
        capitalInicial = 1000000;
        carteiraBitcoin = 0;
    }
    
    public void run() {
        Random rand = new Random();
        int n = rand.nextInt(50);
        for(int i=0; i<=100;i++) {
            
            buffer.comprar(n);
            
            buffer.vender(n);
            
            comprar(n);
            vender(n);
        }
    }
    
    public void vender(int qtdVender) {
        capitalInicial = capitalInicial + qtdVender;
        carteiraBitcoin = carteiraBitcoin - qtdVender;
    }
    
    public void comprar(int qtdComprar) {
        capitalInicial = capitalInicial - qtdComprar;
        carteiraBitcoin = carteiraBitcoin + qtdComprar;
    }
    
}
