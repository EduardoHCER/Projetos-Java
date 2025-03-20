import java.util.Scanner;

class Input {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetor = new int[5];

    for(int i=0; i < vetor.length; i++){
        System.out.printf("Informe o elemento %d: ", i);
        vetor[i]=input.nextInt();
    }

    for(int i=0; i < vetor.length; i++){
        System.out.printf(" %d ", vetor[i]);
    }

// Fecha o objeto Scanner
input.close();
}
}