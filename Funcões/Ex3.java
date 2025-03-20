/*Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de kW consumidos, 
sendo que o valor do kW é:
1- 0,60 (pessoa física), 
2- 0,48 (comércio) 
3- 1,29 (indústria). */

import java.util.Scanner;

class ex2 {

    // Metodo para calcular o valor hora/aula
    public static void retorno(int tipoconta, float consumo)
     {
         float pagamento =0;
         if(tipoconta == 1)
         {
            pagamento = consumo * 0.60f;
         }
         else if(tipoconta == 2)
         {
             pagamento = consumo * 0.48f;
         }
         else if(tipoconta == 3)
         {
             pagamento = consumo * 1.29f;
         }
         
         //Imprimir resultado do calculo hora/aula
         System.out.printf("Tipo de conta: %d\nConsumo em KW: %f\nValor a pagar: %.2f",tipoconta,consumo,pagamento);
     }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Escolha o tipo de conta: \n1-CPF\n2-CNPJ Comercio\n3-CNPJ Industria\n");
        int tipoconta = input.nextInt();

        System.out.printf("KW Consumidos: ");
        float consumo = input.nextFloat();

        retorno(tipoconta, consumo);
    }
}