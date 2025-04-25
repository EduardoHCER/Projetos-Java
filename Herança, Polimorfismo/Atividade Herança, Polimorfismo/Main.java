
class Main {
    public static void main(String[] args) {

        /* Estanciar as classe */
        Livro livro1 = new Livro("Java", 2011, "Jorge simões", 249);
        livro1.mostrarDetalhes();
        System.out.println();

        DVD dvd1 = new DVD("Transformers", 2012, "Ação", 115);
        dvd1.mostrarDetalhes();
        System.out.println();

    }

}

class ItemBiblioteca {

    public String titulo;
    public int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());
    }

}

class Livro extends ItemBiblioteca {
    public String autor;
    public int paginas;

    public Livro(String titulo, int anoPublicacao, String autor, int paginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Autor: " + getAutor());
        System.out.println("Quantidade de paginas: " + getPaginas());
    }
}

class DVD extends ItemBiblioteca {
    public String categoria;
    public int duracaoMinutos;

    public DVD(String titulo, int anoPublicacao, String categoria, int duracaoMinutos) {
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Tempo de duração: " + getDuracaoMinutos());

    }

}
