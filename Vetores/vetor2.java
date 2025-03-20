/*Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na
sequência, apresente na tela os valores que são iguais ou superiores à média */

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetor = new int[5];
    int media =0;

    for(int i=0; i < vetor.length; i++){
        System.out.printf("Informe o elemento %d: ", i);
        vetor[i]=input.nextInt();
        media += vetor[i];
    }
    media = media / vetor.length;

    for(int i=0; i < vetor.length; i++){
        System.out.printf(" %d ", vetor[i]);
    }

    for(int i=0; i < vetor.length; i++){
        if(vetor[i]>media){
            System.out.printf("valores maiores que a media: [%d] ",vetor[i]);
        }
    }
// Fecha o objeto Scanner
input.close();
}
}