import java.util.Scanner;

class Carro{
    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);
    
    int num,menor;

    System.out.printf("Digite o primerio numero: ");
    menor = input.nextInt();
    
    System.out.printf("Digite o segundo numero: ");
    num = input.nextInt();
    
    if(num < menor){
        menor = num;
    }
    
    System.out.printf("Digite o terceiro numero: ");
    num = input.nextInt();
    
    if(num < menor){
        menor = num;
    }
    
   System.out.printf("\nO menor numero eh: %d", menor); 
   
    input.close();
}
}
