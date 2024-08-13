package view;

import controller.ControllerInverte;
import java.util.Random;

public class Principal {
    
    public static void main(String[] args) {
        ControllerInverte conInv = new ControllerInverte();
        int[] vetor = new int[10];
        Random gerador = new Random();
        
        for(int x = 0; x < 10; x++){
            vetor[x] = gerador.nextInt(99);
            System.out.println(vetor[x]);
        }
        
        System.out.println("------------------------------------");
        
        vetor = conInv.inverteVetor(vetor, 0, vetor.length-1);
        
        for(int x = 0; x < 10; x++){
            System.out.println(vetor[x]);
        }
        
    }
    
}
