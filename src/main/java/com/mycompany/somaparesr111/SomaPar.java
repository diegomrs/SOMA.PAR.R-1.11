

package com.mycompany.somaparesr111;

import java.util.Scanner;

public class SomaPar {
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void main(String[] args) {
        int i, n;
        int somapar = 0;
        int somaimpar = 0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um numero inteiro positivo: ");
        n = ler.nextInt();
        for ( i = 1; i < n; i++) {
            if( i % 2 == 0){
            somapar += i;
            }else{ 
            somaimpar += i;
            }
        }
        System.out.println("Soma dos Pares =  " + somapar);
        System.out.printf("Soma dos impares =  " + somaimpar);
    }
    
}














