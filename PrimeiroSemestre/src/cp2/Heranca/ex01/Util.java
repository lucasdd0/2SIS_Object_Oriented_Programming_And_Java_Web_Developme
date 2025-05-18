package cp2.Heranca.ex01;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Util {

    ArrayList<Empregado> empregados = new ArrayList<>();

    public void menu(){

        String aux = "1. Cadastrar\n2. Listar\n3. Finalizar";
        int opcao;

            while(true) {
                try {
                    opcao = parseInt(showInputDialog(aux));
                    switch (opcao) {
                        case 1:
                            cadastrarUsuario();
                            break;
                        case 2:
                            listarUsuarios();
                            break;
                        case 3:
                            return;
                        default:
                            showMessageDialog(null, "Opção inválida!");
                    }
                }catch(Exception e){
                    showMessageDialog(null, "Opção inválida!");
                }
            }
    }

    private void cadastrarUsuario() {
        long matricula;
        String nome;
        int totalDeHorasTrabalhadas;
        double valorDaHoraTrabalhada;
        double totalDeVendas, comissao;

        String aux = "1. Empregado Horista\n2. Empregado Comissionado\n3. Finalizar";

        int opcao = parseInt(showInputDialog(aux));

        if(opcao == 3){
            return;
        }

        try{
            matricula = parseLong(showInputDialog("Matrícula: "));
            nome = showInputDialog("Nome: ");
            if(opcao == 1){
                totalDeHorasTrabalhadas = parseInt(showInputDialog("Digite o total de horas trabalhadas: "));
                valorDaHoraTrabalhada = parseDouble(showInputDialog("Digite valor da hora trabalhada: "));
                empregados.add(new EmpregadoHorista(matricula, nome, totalDeHorasTrabalhadas, valorDaHoraTrabalhada));
            }
            else if (opcao == 2){
                totalDeVendas = parseDouble(showInputDialog("Digite o total de vendas: "));
                comissao = parseDouble(showInputDialog("Digite a porcentagem da comissao: "));
                empregados.add(new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao));
            }

        }catch(Exception e){
            showMessageDialog(null, e);
        }
    }

    private void listarUsuarios() {
        StringBuilder lista = new StringBuilder("LISTA DE EMPREGADOS\n\n");
        if(empregados.isEmpty()){
            showMessageDialog(null, "Nenhum usuário cadastrado!");
            return;
        }
        for(Empregado emp : empregados){
            lista.append(emp).append("\n---------------------\n");
        }
        showMessageDialog(null, lista.toString());
    }

}
