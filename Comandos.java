class Class_base {
    public static void main(String[] args) {
    System.out.print("Hello, World!");
    }
    }
--------------------------------------------------------------------------------------------------
    Exemplo 1 
        int velocidade_maxima;
        velociadade_maxima = 80;
    Exemplo 2 
        int velocidade_maxima = 80;

    Impressao/print

        System.out.print(); // Imprime string dentro das aspas.
        System.out.println(); // Imprime string dentro das aspas semelhante ao método método
        print(). Em seguida, o cursor se move para o início da próxima linha.
        System.out.printf(); // Permite a formatação de string, semelhante ao printf na
        linguagem C.

---------------------------------------------------------------------------------------------------
    
    import java.util.Scanner;
    class Input {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um numero: ");
    int numero = input.nextInt();
    System.out.println("Voce informou: " + numero);
    // Fecha o objeto Scanner
    input.close();
    }

------------------------------------------------------------------------------------------
/* Seleção simples - Modelo 1*/
if(condição){
    bloco_de_comandos;
    }
    /* Seleção simples - Modelo 2*/
    if(condição){
    bloco_de_comandos_1;
    }
    else{
    bloco_de_comandos_2;
    }
    /* Seleção simples - Modelo 3*/
    if(condição_1){
    bloco_de_comandos_1;
    }
    else if(condição_2){
    bloco_de_comandos_2;
    }
    .
    .
    .
    else{
    bloco_de_comandos_n;
    }
--------------------------------------------------------------------------------------------

/* Seleção composta */
switch (variável){
    case valor_1: bloco_de_comandos_1;
    break;
    case valor_2: bloco_de_comandos_2;
    break;
    case valor_3: bloco_de_comandos_3;
    break;
    ...
    case valor_n: bloco_de_comandos_n;
    break;
    default: bloco_de_comandos_específico;
    }
