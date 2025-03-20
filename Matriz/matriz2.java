/*Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição,
apresente na tela a soma de todos os elementos da terceira linha da matriz. */

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[][] matriz = new int[5][5];
    int i, j;
    int soma=0; 
    

    //PREENCHER OS VALORES DA MATRIZ
    for(i=0; i < 5; i++){
        for(j=0; j < 5; j++){
            System.out.printf("Digite os valores para [%d][%d]: ",i,j);
            matriz[i][j]=input.nextInt();
        }
    }
    
    for(j=0; j < 5; j++){
            soma += matriz[2][j];
    }
    
    //EXIBIR VALORES DA MATRIZ
    for(i=0; i < 5; i++){
        for(j=0; j < 5; j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.printf("\n");
    }

    System.out.printf("\nValor da soma: %d", soma);
    
// Fecha o objeto Scanner
input.close();
}
}