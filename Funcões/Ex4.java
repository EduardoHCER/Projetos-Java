/*Escreva um método que solicite ao usuário o nome de um produto, o preço desse produto e o valor em dinheiro entregue ao vendedor. 
Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo: 
"Você comprou um produto (mouse) por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro. 
Você vai receber R$ 15,00 de troco. Volte sempre!". */

import java.util.Scanner;

class ex4{

    public static void troco(String nomeproduto, float valorproduto, float valorentregue) {
        float troco = 0;
        troco = valorentregue - valorproduto;
        System.out.printf("Nome do produto: %s\nValor do produto: %.2f\nValor em dinheiro entregue: %.2f\nVocê vai receber %.2f de troco, Volte Sempre!",
        nomeproduto,valorproduto,valorentregue,troco);
    }


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.printf("Qual o produto escolhido: ");
    String nomeproduto = input.nextLine();
    
    System.out.printf("Qual o valor do produto: ");
    float valorproduto = input.nextFloat();

    System.out.printf("Valor em dinheiro entregue ao vendedor: ");
    float valorentregue = input.nextFloat();
    
    
    troco(nomeproduto,valorproduto,valorentregue);
    }
}