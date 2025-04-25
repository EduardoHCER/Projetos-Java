
class Main {
    public static void main(String[] args) {

        Animal meuGato = new Animal("Bu", 11);
        meuGato.mostrarInfo();
        meuGato.emitirSom();
        System.out.println();

        Cachorro meuCachorro = new Cachorro("Bruce", 9, "Sem raca");
        meuCachorro.mostrarInfo();
        meuCachorro.emitirSom();

    }
}

class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom() {
        System.out.println("Som generico");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

}

// Extends indica que a classe atual irá herdar o atributos da classe citada, ex: extends "Animal".
class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override //Indica que este metodo sobescreve o primeiro metodo com o mesmo nome.
    public void emitirSom() {
        System.out.println("Auaua");
    }

    @Override //Indica que este metodo sobescreve o primeiro metodo com o mesmo nome.
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raça: " + getRaca());
    }

}
