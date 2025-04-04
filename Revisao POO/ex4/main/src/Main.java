import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Abertura scanner
        Scanner input = new Scanner(System.in);

        // Iniciando objeto.
        func a = new func();

        // Preenchendo valores das variaveis do objeto.
        System.out.println("Nome do funcionario: ");
        a.nome = input.nextLine();
        System.out.println("Salario bruto: R$");
        a.salarioB = input.nextDouble();
        System.out.println("Taxa: R$");
        a.taxa = input.nextDouble();

        // Função Exibir.
        System.out.println(a.toString());

        // função para aumento do salario.
        System.out.println("\nAumento do salario em %: ");
        double porcentagem = input.nextDouble();
        a.Aumento(porcentagem);


        // função Exibir.
        System.out.println("\nUpadte data: ");
        System.out.println(a.toString());

        //Fechamento Scanner.
        input.close();
    }
}
