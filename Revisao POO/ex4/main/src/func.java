public class func {
    
    String nome;
    double salarioB;
    double taxa;

    public double SalarioL(){
        return salarioB - taxa;
    }

    public void Aumento(double porcentagem){
        porcentagem = (salarioB*porcentagem)/100;
        salarioB += porcentagem;
    }

    public String toString(){
        return "\nNome: " + nome + ", Salario bruto: "+salarioB+ ", Salario Liquido: "+SalarioL();
    }
}
