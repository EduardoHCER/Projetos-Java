/*Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de
repetição, apresente na tela a soma de todos os elementos da matriz. */

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[][] matriz = new int[2][3];
    int i, j;
    int soma=0; 
    

    //PREENCHER OS VALORES DA MATRIZ
    for(i=0; i < 2; i++){
        for(j=0; j < 3; j++){
            System.out.printf("Digite os valores para [%d][%d]: ",i,j);
            matriz[i][j]=input.nextInt();

            //Fazer a soma dos valores da matriz 
            soma += matriz[i][j];
        }
    }

    //EXIBIR VALORES DA MATRIZ
    for(i=0; i < 2; i++){
        for(j=0; j < 3; j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.printf("\n");
    }

    System.out.printf("\nValor da soma: %d", soma);
    
// Fecha o objeto Scanner
input.close();
}
}
