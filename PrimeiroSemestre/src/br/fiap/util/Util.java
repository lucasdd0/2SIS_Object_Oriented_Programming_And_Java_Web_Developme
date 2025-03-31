package br.fiap.util;
import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[5];
    private Produto[] produtos = new Produto[2* fornecedor.length];
    private int idxFornecedor = 0;
    private int idxProduto = 0;

    public void menu(){
        int opcao;
        String aux = "1. Cadastrar Produto\n2." +
                     "2. Pesquisar Produto\n2." +
                     "3. Pesuisar Fornecedor\n2" +
                     "4. Finalizar";

        while(true){
            opcao = parseInt(showInputDialog(aux));
            if(opcao == 4){
                return;
            }

            switch (opcao){
                case 1:
                    cadastrarProduto;
                    break;
                case 2:
                    pesquisarProduto;
                    break;
                case 3:
                    pesquisarFornecedor;
                default:
                    showMessageDialog(null, "Opção Inválida!");

            }
        }
    }

    public void cadastrarProduto(){
        Strign nome;
        int qtdEstoque;
        double fornecedor = pesquisarFornecedor();
        if(fornecedor == null){
            cadastrarFornecedor();
        }
    }

    public void cadastrarFornecedor(){
        long cnpj = parseLong(showMessageDialog("CNPJ do fornecedor"));
        String nome = showInputDialog("Fornecedor");
        fornecedor[idxFornecedor] = new Fornecedor(nome, cnpj);
        idxFornecedor++;
    }

    public Fornecedor pesquisarProduto(){
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        for(int i = 0; i < idxFornecedor; i++){
            if(fornecedor[i].getCnpj() == cnpj){
                return fornecedor[i];
            }
        }
        showMessageDialog(null, cnpj + "não encontrado");
        return null;
    }

    public void pesquisarFornecedor(){

    }
}
