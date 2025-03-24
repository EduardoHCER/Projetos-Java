class Main {
    public static void main(String[] args) {
        /* Criando uma instância da classe Exemplo */
        Exemplo exemplo = new Exemplo();
        /* Acessando o atributo e método público */
        exemplo.numeroPublico = 10;
        exemplo.mostrarNumeroPublico();
        /* Acessando o atributo privado através de um método público */
        exemplo.setNumeroPrivado(20);
        exemplo.mostrarNumeroPrivado();
        /* Acessando o atributo e método protegido através de um método público */
        exemplo.setNumeroProtegido(30);
        exemplo.mostrarNumeroProtegido();
        /* Exibindo os valores diretamente na Main */
        System.out.println("Numero Publico: " + exemplo.numeroPublico);
        // Acessando através dos métodos públicos
        System.out.println("Numero Privado: " + exemplo.getNumeroPrivado());
        System.out.println("Numero Protegido: " + exemplo.getNumeroProtegido());
    }

    // Tornando Exemplo uma classe estática
    static class Exemplo {
        /* Atributo público */
        public int numeroPublico;
        /* Atributo privado */
        private int numeroPrivado;
        /* Atributo protegido */
        protected int numeroProtegido;

        /* Método público */
        public void mostrarNumeroPublico() {
            System.out.println("Numero Publico: " + numeroPublico);
        }

        /* Método privado */
        private void mostrarNumeroPrivado() {
            System.out.println("Numero Privado: " + numeroPrivado);
        }

        /* Método protegido */
        protected void mostrarNumeroProtegido() {
            System.out.println("Numero Protegido: " + numeroProtegido);
        }

        /* Método público para setar o valor do número privado */
        public void setNumeroPrivado(int num) {
            this.numeroPrivado = num;
        }

        /* Método público para obter o valor do número privado */
        public int getNumeroPrivado() {
            return numeroPrivado;
        }

        /* Método público para setar o valor do número protegido */
        public void setNumeroProtegido(int num) {
            this.numeroProtegido = num;
        }

        /* Método público para obter o valor do número protegido */
        public int getNumeroProtegido() {
            return numeroProtegido;
        }
    }
}
