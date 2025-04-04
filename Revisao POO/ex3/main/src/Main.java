import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws Exception {
        // Abertura scanner
        Scanner input = new Scanner(System.in);

        //Criar instancia de classe
        Retangulo a = new Retangulo();

        // Entrada de dados do retangulo.----------
        System.out.println("Altura do retangulo: ");
        a.altura = input.nextDouble();
        System.out.print("largura do retangulo: ");
        a.largura = input.nextDouble();
        //-----------------------------------------

        //Exibir calculos 'toString'.
        System.out.println(a.toString());

        input.close();

    }
}
