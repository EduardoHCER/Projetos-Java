/*Escreva um método que solicite ao usuário o nome e o preço de um produto. Em seguida, deve ser mostrada uma mensagem baseada no seguinte
 exemplo: "Você comprou um produto (mouse) por R$ 185,00 e acaba de ganhar um desconto de 10%. 
 Assim você vai pagar apenas R$ 166,50 pelo seu produto. Volte sempre!".*/

 import java.util.Scanner;

 class ex4{
 
     public static void desconto(String nomeproduto, float valorproduto) 
     {
         float desconto = valorproduto-(valorproduto*0.10f);
         
         System.out.printf("Você comprou um produto [%s] por %.2f e acaba de receber um desconto de 10%%, o valor final a pagar eh %.2f, Volte Sempre! :)"
         ,nomeproduto,valorproduto,desconto);
     }
 
 
     public static void main(String[] args) 
     {
         
     Scanner input = new Scanner(System.in);
 
     System.out.printf("Qual o produto escolhido: ");
     String nomeproduto = input.nextLine();
     
     System.out.printf("Qual o valor do produto: ");
     float valorproduto = input.nextFloat();
     
     
     desconto(nomeproduto,valorproduto);
     }
 }