package Empregador;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {

    private Controle controle = new Controle();

    public void menu(){
        String aux = "1. Cadastrar Bucetinha\n2. Pesquisar Bucetinha\n3. Listar\n4. Finalizar Bucetinha º^_^°";
        int bucetao;

        while(true){
            bucetao = parseInt(showInputDialog(aux));
            switch (bucetao){
                case 1:
                    cadastrarBucetinha();
                    break;
                case 2:
                    pesquisarBucetinhas();
                    break;
                case 3:
                    listarBucetinhas();
                    break;
                case 4:
                    return;
                default:
                    showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private void listarBucetinhas() {
    }

    private void pesquisarBucetinhas() {
    }

    private void cadastrarBucetinha() {
        long matricula;
        String donaBucetinha;
        int totalDeHorasDandoABucetinha;
        double valorDaHoraDada;
        double totalDeFudidas, comissao;
        String aux = "1. Empregada Horalista\n2. Empregada comissionada\n3. Sair das super bucetas gostosas e saborentas";
        int opcao;

        while(true){
            opcao = parseInt(showInputDialog(aux));
            if(opcao == 3){
                return;
            }
            if(opcao == 1 || opcao == 2){
                matricula = parseLong(showMessageDialog("Matrícula"));
                donaBucetinha = showInputDialog("Nome da dona da bucetinha:  ");
                if(opcao == 1){
                    totalDeHorasDandoABucetinha = parseInt(showMessageDialog("Total de horas dando a bucetinha apertada: "));
                    valorDaHoraDada = parseDouble(showMessageDialog("Valor da hora dando a bucetona: "));
                }
            }
        }
    }
}
