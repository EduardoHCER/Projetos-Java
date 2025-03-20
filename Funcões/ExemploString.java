import java.util.Scanner;
class Exemplo{
    
    public static void msg(String nome, int idade)
    {
        System.out.printf("Hoje conheci %s, ele tem %d anos!", nome, idade);
    }
    

    public static void main(String[]args){
        
    Scanner input = new Scanner (System.in);
    
    System.out.printf("Informe seu nome: ");
    String nome = input.nextLine();
    System.out.printf("Informe sua idade: ");
    int idade = input.nextInt();
    
    msg(nome, idade);
    }
}