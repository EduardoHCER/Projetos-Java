/*Escreva um método que retorne o maior valor entre três números inteiros. */

import java.util.Scanner;

class ex6{

    public static void resultado(int[] numeros) 
    {
        int maior =numeros[0];
        for(int i=0; i<numeros.length;i++)
        {
            if(numeros[i]>maior)
            {
                maior = numeros[i];
            }
        }
        System.out.printf("O maior valor eh: %d",maior);
    }

    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    int[] numeros = new int[3];

    for(int i=0; i<numeros.length;i++)
    {
        System.out.printf("Digite o valor do numero [%d]: ",i+1);
        numeros[i] = input.nextInt();
    }
    
    input.close();

    resultado(numeros);
        
    }
}
