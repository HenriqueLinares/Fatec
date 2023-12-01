import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Funcionarios func[] = lerDados();
        int opcao;
        do {
            System.out.println("\nMenu\n"
                    + "1 – Exibir salários\n"
                    + "2 – Aumentar salários\n"
                    + "3 – Sair\n"
                    + "Digite a opção desejada:");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

    }

    public static Funcionarios[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Funcionarios func[] = new Funcionarios[2];

        for (int i = 0; i < func.length; i++) {
            func[i] = new Funcionarios(scan.next(), scan.nextDouble(), scan.nextInt());
            System.out.printf("%12s %12.2f %12d\n", func[i].getNome(),
                    func[i].getSalarioBase(), func[i].getNumFilhos());

        }
        return func;
    }

    public static void exibirSalarios(Funcionarios[] func) {
        System.out.println("\nNomes e Salários Finais dos Funcionários:");
        for (Funcionarios funcionario : func) {
            System.out.println(funcionario.getNome() + ": R$ " + funcionario.salarioFinal());
        }
    }

    public static void aumentarSalario(Funcionarios[] func) {

    }

}
