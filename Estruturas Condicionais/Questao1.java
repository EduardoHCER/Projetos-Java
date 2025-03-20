import java.util.Scanner;

class Carro{
    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.printf("Digite o primerio numero: ");
    int num_1 = input.nextInt();
    
    System.out.printf("Digite o segundo numero: ");
    int num_2 = input.nextInt();
    
    if (num_1>num_2){
        System.out.printf("%d,%d",num_2,num_1);
    }
    else{
        System.out.printf("%d,%d",num_1,num_2);
    }

    input.close();
}
}