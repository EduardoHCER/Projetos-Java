class Main {
    public static void main(String[] args) {

        // Inserindo informações em um novo 'Produto'.
        produto p1 = new produto("Mouse", 35, 10);
        p1.exibir();

        p1.atualizarestoque(5);
        p1.exibir();

        p1.setPreco(70);
        p1.exibir();

        p1.atualizarestoque(-14);
        p1.exibir();

    }

    static class produto {

        // Definição dos atributos da classe.----------------------
        private String nome;
        private double preco;
        private int qtdestoque;
        public int quantidade;

        // Método de construção da classe, referenciado.------------
        public produto(String nome, double preco, int qtdestoque) {
            this.nome = nome;
            this.preco = preco;
            this.qtdestoque = qtdestoque;
        }

        // =============SETTER e GATTERS========================

        // Set e Get "Nome".----------------------------------
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        // Set e Get "Preço".--------------------------------
        public void setPreco(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }

        // Set e Get "QtdEstoque".----------------------------
        public void setQtdestoque(int qtdestoque) {
            this.qtdestoque = qtdestoque;
        }

        public int getQtdestoque() {
            return qtdestoque;
        }

        // ===================METODO ATUALIZAR ESTOQUE==========

        public void atualizarestoque(int quantidade) {
            this.qtdestoque += quantidade;

            if (this.qtdestoque < 0) {
                this.qtdestoque = 0;
                System.out.println("Estoque não pode ficar negativo!");
            }

        }
        /*
         * 
         * public void setQuantidade(int quantidade){
         * this.quantidade = quantidade;
         * }
         * 
         * public int getQuantidade(){
         * return quantidade;
         * }
         * 
         */

        // ==================METODO EXIBIR INFO'S=================

        public void exibir() {
            System.out.println("----Exibir estoque----");
            System.out.println("Nome do Produto: [" + nome + "]");
            System.out.println("Preco do Produto: R$[" + preco + "]");
            System.out.println("Quantidade em estoque: [" + qtdestoque + "]");
            
        }

    }
}