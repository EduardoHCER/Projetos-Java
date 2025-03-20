package Estruturas_Sequenciais;
import java.util.Scanner;

class Refrigerante{
public static void main(String[]args){
    System.out.print("Questão 3 - Refrigerantes");

Scanner input = new Scanner(System.in);

//Pedindo quantidade de cada tamanho de Refri

System.out.print("\nQuantas latas de 350ml: ");
int latas = input.nextInt();
System.out.print("\nQuantas garrafas de 600ml: ");
int garrafaM = input.nextInt();
System.out.print("\nQuantas garrfas de 2l: ");
int garrafaG = input.nextInt();


//Calculo litros
float litros_total = (latas*0.35f)+(garrafaM*0.6f)+(garrafaG*2);

//Saida resultado
System.out.printf("Total de litros: %.2f ",litros_total);

input.close();
}
}
