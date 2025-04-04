public class Produto {

    String nome;
    Double preco;
    int qtd;

    // Método para Calcular valor do total dos produtos em estoque.
    public double ValorEstoque(){
        return preco * qtd;
    }

    // Setter para alterar preço
    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    // Método exibir, para mostrar valores atuais.
    public void Exibir(){
        System.out.println("\nProduto: " + nome + "\nPreco: R$" + preco + "\nQuantidade: " + qtd + "\nValor total em estoque: "+ ValorEstoque());
    }

    // Método para adicionar produtos ao estoque.
    public void Entrada(int qtd){
        // This = Se refere ao atributo principal da classe e recebe o parametro da função. this.qtd = "qtd".
        this.qtd += qtd;
    }

    // Método para remover produtos do estoque.
    public void Saida(int qtd){
        this.qtd -= qtd;
    }


    }


