import java.util.Scanner;

class exe2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Adicionar uma nova pessoa "Pessoa p1" com metodo 'new Pessoa'.

        Pessoa p1 = new Pessoa();
        // Atribuir p1.'variavel' = 'valor'.
        p1.nome = "Marcelo";
        p1.idade = 55;
        p1.peso = 80;
        p1.altura = 175;

        //Chamar os métodos para execução.
        p1.status();
        p1.envelhecer();
        
        // Método deve receber 'input' como parâmetro para ter seu valor alterado.
        p1.engordar(input); 
        p1.emagrecer(input);

        p1.status();

        Pessoa p2 = new Pessoa();
        // Atribuir p2.'variavel' = 'valor'.
        p2.nome = "Eduardo";
        p2.idade = 23;
        p2.peso = 65;
        p2.altura = 170;

        p2.status();
        p2.envelhecer();
        
        // Método deve receber 'input' como parâmetro para ter seu valor alterado.
        p2.engordar(input);
        p2.emagrecer(input);
        p2.status();

        input.close();

    }
}

// Criar a classe pessoa e seus atributos.
class Pessoa {

    String nome;
    int idade;
    float peso;
    float altura;

    // Método 'Status' visualiza as informações da classe 'Pessoa'.
    public void status() {
        // Função 'This' faz referencia a uma instância(variável).
        System.out.println("Nome: " + this.nome + ". ");
        System.out.println("Idade: " + this.idade + "anos. ");
        System.out.println("Peso: " + this.peso + "kg. ");
        System.out.println("Altura: " + this.altura + "cm. ");
    }

    // Método 'envelhecer' acrescenta +idade ao ser chamado na 'Main'.
    public void envelhecer() {

        // Acrescentea +1 ano de idade no metodo
        this.idade += 1;

        if (this.idade < 21) {
            // Se <21 recebe 1 cm por ano.
            this.altura += 1;

        }
    }

    // Método 'Engordar' solicita o valor do ganho para alterar o peso ao ser chamado na 'Main'.
    public void engordar(Scanner input) {
        //Obs: O método deve receber '(Scanner input)' como parâmetro, pois Scanner foi declaro na main.

        System.out.printf("Quantos kg o/a " + this.nome + " ganhou: ");
        this.peso += input.nextFloat();


    }

    // Método 'Engordar' solicita o valor da perda para alterar o peso ao ser chamado na 'Main'.
    public void emagrecer(Scanner input) {
        //Obs: O método deve receber '(Scanner input)' como parâmetro, pois Scanner foi declaro na main.

        System.out.printf("Quantos kg o/a " + this.nome + " perdeu: ");
        this.peso -= input.nextFloat();

    }
}
