
package com.mycompany.somaparesr111;

import java.util.Scanner;

public class SomaPar {
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void main(String[] args) {
        int i, n;
        int somapar = 0;
        int somaimpar = 0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um número inteiro positivo: ");
        n = ler.nextInt();
        for ( i = 1; i < n; i++) {
            if( i % 2 == 0){
                System.out.println("Número Pare = " + i);
            somapar += i;
            }else{
                System.out.println("Número Ímpares = " + i);
            somaimpar += i;
            }
        }
        System.out.println("Soma dos Pares =  " + somapar);
        System.out.printf("Soma dos Ímpares =  " + somaimpar);
    }
    
}










