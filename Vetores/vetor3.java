/*Escreva um programa alimente um vetor de 5 números inteiros distintos. Em seguida, leia um número
qualquer do teclado e mostre na tela o índice em que ele se encontra no vetor, ou então a mensagem
"Elemento não encontrado!", se ele não estiver presente no vetor */

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetor = new int[5];
    int indice=0;
    int encontrado =0;

    for(int i=0; i < vetor.length; i++){
        System.out.printf("Informe os valores do vetor [%d]: ", i);
        vetor[i]=input.nextInt();
    }

    
    System.out.printf("\nDigite um valor para localizar sua posicao: ");
    int localizar = input.nextInt();
    
    for(int i=0; i < vetor.length; i++){
        if(localizar == vetor[i]){
        indice = i;
        encontrado = 1;
        }
    }
        
    if(encontrado == 1){
        System.out.printf("Localizado, posicao [%d]", indice);
    }   
    else{
        System.out.printf("Nao localizado");
    }
      
// Fecha o objeto Scanner
input.close();
}
}