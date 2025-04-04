public class Aluno {

    String nome;
    double notaA;
    double notaB;
    double notaC;

    public double media(){
        return (notaA+notaB+notaC);
    }

    public void result(){

        if (media() >= 60) {
            System.out.println("Aprovado!");
            System.out.println("Nota: "+media());
        }
        else{
            double faltou = 60-media();
            System.out.println("Reprovado! ");
            System.out.println("Pontos para passar: "+faltou);
        }
    }
}
