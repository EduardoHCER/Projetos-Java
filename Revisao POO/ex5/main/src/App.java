import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Aluno a = new Aluno();


        System.out.println("Nome: ");
        a.nome = input.nextLine();
        System.out.println("Insira 3 notas: ");
        a.notaA = input.nextDouble();
        a.notaB = input.nextDouble();
        a.notaC = input.nextDouble();

        System.out.println("\nResultado-------------------------");

        a.media();
        a.result();



        input.close();
    }
}
