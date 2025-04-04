public class Retangulo {
    
    double altura;
    double largura;

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * (largura + altura);
    }

    public double diagonal(){
        return Math.sqrt((largura*largura)+(altura*altura));
    }

    public String toString(){
        return area() + ", " + perimetro() + ", " + diagonal();
    }
}

