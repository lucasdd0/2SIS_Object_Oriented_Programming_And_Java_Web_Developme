package cp2.Heranca_E_ArrayList.ex05.br.fiap.notaFiscal;

import cp2.Heranca_E_ArrayList.ex05.br.fiap.cliente.Cliente;
import cp2.Heranca_E_ArrayList.ex05.br.fiap.item.ItemProduto;
import cp2.Heranca_E_ArrayList.ex05.br.fiap.produto.Produto;

import java.util.List;

public class NotaFiscal {
    private List<ItemProduto> listaproduto;
    private Cliente cliente;
    private boolean status;

    public NotaFiscal(List<ItemProduto> notaFiscal, Cliente cliente, boolean status) {
        this.listaproduto = notaFiscal;
        this.cliente = cliente;
        this.status = status;
    }

    public List<ItemProduto> getListaproduto() {
        return listaproduto;
    }

    public void setListaproduto(List<ItemProduto> listaproduto) {
        this.listaproduto = listaproduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void adicionarItem(ItemProduto notaFiscal){
        this.listaproduto.add(notaFiscal);
    }

    public void removerProduto(Produto produto){
        for(ItemProduto item : listaproduto){
            if(item.getProduto().equals(produto)){
                listaproduto.remove(item);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemProduto itemProduto : this.listaProduto) {
            total += itemProduto.calcularTotal();
        }
        return total;
    }

}
