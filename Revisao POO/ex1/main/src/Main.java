import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Declarar a criação do triangulo e suas variaveis "tipo Triangulo" "Variaveis X,Y";
        // Iniciar a varia x e y com 'new+função'.
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        // Entrada valores Triangulo X
        System.out.println("Valore de A, B, C: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        // Entrada valores Triangulo Y
        System.out.println("Valore de A, B, C: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        // Criar variavel para receber o valor que a função irá retornar.
        double areaX = x.area();
        double areaY = y.area();

        // Imprimir maior valore de area.
        if (areaX > areaY) {
            System.out.println("Triangulo X é maior que triangulo Y.");
        }
        else{
            System.out.println("Triangulo Y é maior que triangulo X.");

        }


        input.close();

    }
}



