package cp2.Heranca_E_ArrayList.ex05.br.fiap.item;

import cp2.Heranca_E_ArrayList.ex05.br.fiap.produto.Produto;

public class ItemProduto{
    private Produto produto;
    private int quantidadeComprada;

    public ItemProduto(Produto produto, int quantidadeComprada) {
        this.produto = produto;
        this.quantidadeComprada = quantidadeComprada;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double calcularTotal(){
        return quantidadeComprada * produto.getValorUnitario();
    }

    @Override
    public String toString() {
        return "Produto: " + produto + "Quantidade comprada: " + quantidadeComprada + "Total: " + calcularTotal();
    }
}
