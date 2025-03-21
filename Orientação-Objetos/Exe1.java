import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Conta p1 = new Conta();
    p1.nome_conta = "Eduardo";
    p1.numero_conta = 1;

    p1.status();
    p1.deposito(input);
    p1.saque(input);
    p1.status();

    input.close();
        
    }
}

class Conta {

    // Declaração variáveis.
    int numero_conta;
    String nome_conta;
    int saldo_conta = 0;
    int saque;

    //Método 'status' para visualizar informações da Classe Conta.
    public void status (){

    System.out.println("Nome do Correntista: "+ this.nome_conta +". ");
    System.out.println("Numero da conta: "+ this.numero_conta +". ");
    System.out.println("Saldo da conta: " + this.saldo_conta + ". ");
    }

    // Método para acrescentar valor ao saldo.
    public void deposito(Scanner input){
    
    System.out.println("Qual valor deseja depositar: ");
    saldo_conta += input.nextFloat();

    }

    public void saque(Scanner input){

    System.out.println("Qual valor deseja sacar: ");
    saque = input.nextInt();

    if (this.saldo_conta > saque) {
        this.saldo_conta -= saque;
    }
    else{
        System.out.println("Você não possui saldo suficiente.");
    }

    }

}