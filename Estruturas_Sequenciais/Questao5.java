package Estruturas_Sequenciais;
/*Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até
encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
abastecidos e a quilometragem percorrida desde o último abastecimento*/

import java.util.Scanner;

class Carro{
public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.printf("Capacidade do tanque: ");
int capacidade = input.nextInt();

System.out.printf("Quantidade de litros abastecidos: ");
float abastecimento = input.nextInt();

System.out.printf("Quantidade de km percorridos: ");
float rodagem = input.nextInt();

float autonomia = abastecimento / rodagem;

System.err.printf("Autonomia do tanque: %d",capacidade *autonomia);


input.close;
}
}
