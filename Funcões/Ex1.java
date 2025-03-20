import java.util.Scanner;

class Exemplo {

    // Método para calcular e exibir a média
    public static void retorno(String nome, float soma, int notas) 
    {
        float media = soma / notas;
        System.out.printf("Nome do aluno: %s, Média de notas: %.1f\n", nome, media);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        // Inicializa o array de notas e a variável soma
        float[] notas = new float[3];
        float soma = 0;

        // Coleta as notas e acumula a soma
        for (int i = 0; i < notas.length; i++) 
        {
            System.out.printf("Digite a nota [%d]: ", i); 
            notas[i] = input.nextFloat();
            soma += notas[i]; 
        }

        // Chama o método de retorno passando o nome, soma e o número de notas como parametro
        retorno(nome, soma, notas.length);
    }
}
