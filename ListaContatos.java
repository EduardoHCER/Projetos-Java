import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamanho = 10; /*  Tamanho da "Agenda" */ 
        Contato[] contato = new Contato[tamanho];

        int numContatos = 0;

        while (true) {
            System.out.println("\n[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Excluir contato");
            System.out.println("[5] Listar contatos");
            System.out.println("[6] Sair");
            int opcao = input.nextInt();

            /* Limpa o buffer do teclado */
            input.nextLine();

            switch (opcao) {
                /* Adicionar contato */
                case 1:
                    /*  Verificação para agenda cheia. */
                    if (numContatos < tamanho) {

                        System.out.print("Informe nome: ");
                        String nome = input.nextLine();

                        System.out.println("Informe o numero: ");
                        String fone = input.nextLine();

                        contato[numContatos] = new Contato(nome, fone);

                        System.out.println("Contato cadastrado com sucesso!\n");

                        numContatos++;

                    } else {
                        System.out.print("Agenda cheia!");
                    }
                    break;

                /* Buscar contato */
                case 2:

                    System.out.print("Nome do contato: ");
                    String busca = input.nextLine();
                    
                    /* Variavel para imprimir de forma certa a msg caso nao encontre */
                    boolean encontradoBusca = false;

                    for (int i = 0; i < numContatos; i++) {
                        if (contato[i].getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Contato encontrado!");
                            System.out.print("Nome: " + contato[i].getNome());
                            System.out.print("Numero: " + contato[i].getFone());

                            encontradoBusca = true;
                        }
                    }

                    if (!encontradoBusca) {
                        System.out.println("Contato nao encontrado!");
                    }

                    break;

                /* Editar contato */
                case 3:

                    System.out.println("Nome do contato: ");
                    String nomeBusca = input.nextLine();

                    /* Variavel para imprimir de forma certa a msg caso nao encontre */
                    boolean encontradoEditar = false;

                    for (int i = 0; i < numContatos; i++) {
                        if (contato[i].getNome().equalsIgnoreCase(nomeBusca)) {

                            System.out.println("Digite o novo numero: ");
                            String novoNumero = input.nextLine();
                            /* Nova 'Var' para salvar novo numero do contato. */
                            contato[i].setFone(novoNumero);
                            encontradoEditar = true;
                        }
                    }

                    if (!encontradoEditar) {
                        System.out.println("Contato nao encontrado!");
                    }

                    break;

                /* Excluir contato */
                case 4:
                    System.out.print("Nome do contato: ");
                    String excluir = input.nextLine();

                    /* Variavel para imprimir de forma certa a msg caso nao encontre */
                    boolean contatoExcluido = false;

                    for (int i = 0; i < numContatos; i++) {
                        if (contato[i].getNome().equalsIgnoreCase(excluir)) {
                            /*  Loop para sobrepor o contato excluido, o mover todos os contatos da agenda para a casa anterior  */
                            for (int j = i; j < numContatos - 1; j++) {
                                contato[j] = contato[j + 1];
                            }
                            numContatos--; /* Reduz o contador de contatos */
                            contatoExcluido = true;
                            System.out.println("Contato excluído com sucesso!");
                            break;
                        }
                    }

                    if (!contatoExcluido) {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                /* Listar contatos */
                case 5:

                    for (int i = 0; i < numContatos; i++) {
                        if (contato[i].getNome() != null) {
                            System.out.println("\nContato: " + (i + 1));
                            System.out.println("Nome: " + contato[i].getNome());
                            System.out.println("Numero: " + contato[i].getFone());
                        }
                    }

                    break;

                /* Sair */
                case 6:
                    input.close();
                    return;

                default:
                    System.out.println("Opcao invalida!\n");
            }
        }
    }
}

/*  ===================================CLASSE CONTATO=============================== */
class Contato {
    private String nome, fone;

    public Contato(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }
}
