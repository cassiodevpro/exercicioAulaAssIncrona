package produto;

public class ProdutoEletronico extends Produto {

    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + " Preço: " + getPreco() + " Garantia: " + garantiaMeses);

    }
}
