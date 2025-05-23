public class Usuario {

    public String nome;
    public double espaco;

    public Usuario(String nome, double espaco) {
        this.nome = nome;
        this.espaco = espaco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEspaco() {
        return espaco;
    }

    public void setEspaco(double espaco) {
        this.espaco = espaco;
    }

}
