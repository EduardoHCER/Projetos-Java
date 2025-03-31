import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criando Lista para contatos.
        ArrayList<contato> ListaContato = new ArrayList<>();

        while (true) {
            System.out.println("\n[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Excluir contato");
            System.out.println("[5] Listar contatos");
            System.out.println("[6] Sair");
            int opcao = input.nextInt();

            input.nextLine();// limpar o buffer;

            switch (opcao) {
                case 1:

                    System.out.println("Nome do contato: ");
                    String nome = input.nextLine();

                    System.out.println("Numero do contato: ");
                    String fone = input.nextLine();

                    contato contato = new contato(nome, fone);
                    ListaContato.add(contato);

                    break;

                case 2:

                    System.out.println("Buscar contato: ");
                    String busca = input.nextLine();

                    for(int i=0; i > ListaContato.size();i++){

                        contato contato = ListaContato.get(i);

                        if (contato[i].getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: "+contato[i].getNome);
                        }
                    }


                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    System.out.println("\nTodos os contatos salvos!");
                    // Loop 'Foreach', simplificado para impressão, porém não possibilita controles.
                    for (contato contato : ListaContato) {
                        System.out.println(contato);
                    }

                    break;

                case 6:

                    input.close();
                    System.out.println("Encerrando!");
                    return;

                default:

                    System.out.println("Opcao invalida!");

                    break;
            }
        }

    }
}

class contato {
    private String nome, fone;

    public contato(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.fone = fone;
    }

    public String getNome() {
        return getNome();
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return getFone();
    }

    public String toString() {
        return "Nome: " + nome + ", Número: " + fone;
    }

}
