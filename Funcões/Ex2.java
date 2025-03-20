/*Uma escola remunera seus professores por hora/aula ministrada. 
Escreva um método que calcule e retorne o salário de um professor, 
sendo que o valor hora/aula obedece aos seguintes critérios: 
20,00 para o nível 1, 
25,00 para o nível 2 
30,00 para o nível 3. 
*/

/*
 1-Nome do professor
 2-nivel do professor
 3-horas trabalhadas
 4-metodo horas/trabalhadas
 5-retorno do metodo
 */

import java.util.Scanner;

class ex2{

    //Metodo para calcular o valor hora/aula
    public static void retorno(String nome, int nivel, int horas)
    {
        int pagamento =0;
        if(nivel == 1)
        {
            pagamento = horas * 20;
        }
        else if(nivel == 2)
        {
            pagamento = horas * 25;
        }
        else if(nivel == 3)
        {
            pagamento = horas * 30;
        }
        else{
            System.out.printf("Valor de nivel invalido");
            return;
        }
        
        //Imprimir resultado do calculo hora/aula
        System.out.printf("Nome do Professor: %s\nNivel do Professor: %d\nHoras trabalhadas: %d\nPagamento final: %d"
        ,nome,nivel,horas,pagamento);
    }

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.printf("Nome do Professor: ");
    String nome = input.nextLine();

    System.out.printf("Nivel do Professor: ");
    int nivel = input.nextInt();

    System.out.printf("Horas trabalhadas: ");
    int horas = input.nextInt();

    input.close();
    

    retorno(nome,nivel,horas);
    }
}