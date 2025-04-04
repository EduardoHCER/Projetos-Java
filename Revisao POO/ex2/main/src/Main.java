import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Abertura scanner
        Scanner input = new Scanner(System.in);

        // Criação das variaveis do tipo 'Produto'.
        Produto a;
        a = new Produto();

        // Leitura dados do produto.
        System.out.println("Nome do produto: ");
        a.nome = input.nextLine();
        System.out.println("Preço do produto: ");
        a.preco = input.nextDouble();
        System.out.println("Quantidade em estoque: ");
        a.qtd = input.nextInt();

        // Chamar função Exibir = 'var'.Exibir.
        a.Exibir();

        // Novo preco do produto usando 'Set'.
        System.out.println("\nNovo preco: ");
        double novo = input.nextDouble();
        a.setPreco(novo);

        a.Exibir();

        // Adicionando produtos ao estoque.
        System.out.println("\nAdicionar qtd ao estoque: ");
        int qtd = input.nextInt();
        a.Entrada(qtd);

        a.Exibir();

        // Subtraindo produtos do estoque.
        boolean saida = true;
        while (saida) {

            System.out.println("\nRetirar qtd do estoque: ");
            qtd = input.nextInt();

            if (qtd < a.qtd) {
                a.Saida(qtd);
                saida = false;
            } else {
                System.out.println("\nQuantidade superior ao estoque. Operacao Invalida!");
            }
        }

        a.Exibir();

        // Fechar scanner.
        input.close();
    }
}