import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Lista {
    public static void main(String[] args) throws Exception {

        // Criar um list de numeros inteiro com numero: 10-20-30-40-50.
        List<Integer> inteiros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(21);
        inteiros.add(30);
        inteiros.add(40);
        inteiros.add(50);

        // Exibindo o tamanho da lista.
        System.out.println("\nTamanho da lista: "+ inteiros.size());
        System.out.println();

        // Exibir os valores dentro da lista.
        System.out.println("Elementos da lista: " + inteiros);
        System.out.println();

        // Verificar se numero 30 e 15 estão listados.

        if (inteiros.contains(15)) {
            System.out.println("Numero 15 está presente na lista.");
        }
        else{
            System.out.println("Nao encontrado.");
        }

        if (inteiros.contains(30)) {
            System.out.println("Numero 30 está presente na lista");
        }
        else{
            System.out.println("Nao encontrado.");
        }

        // Adicionando numero 60.
        inteiros.add(60);

        // Removendo o numero 21 da lista.
        inteiros.remove(Integer.valueOf(21));
        System.out.println("Numero 21 removido da lista");
        System.out.println();

        // Mostrando elementos da lista.
        System.out.println("Elementos da lista: "+inteiros);
        System.out.println();

        // Impressao dos elementos ordenados.
        Collections.sort(inteiros);
        System.out.println("Elementos da lista: "+ inteiros);
        System.out.println();

        // Impressao do elementos em ordem descrescente.
        Collections.sort(inteiros, Collections.reverseOrder());
        System.out.println("Elementos da lista (Decrescente): "+inteiros);
        System.out.println();

        // Loop para adicionar somente os numeros pares ao List "Pares".
        for (int i = 0; i < inteiros.size(); i++){
            if (inteiros.get(i) % 2 == 0) {
                pares.add(inteiros.get(i));
            }
        }

        // Exibindo Pares.
        System.out.println("Elementos Pares: " + pares);
        System.out.println();

        inteiros.clear();
        System.out.println("Elementos da lista Inteiros: "+inteiros);
        System.out.println();
        pares.clear();
        System.out.println("Elementos da lista Pares: "+ pares);


    }
}
