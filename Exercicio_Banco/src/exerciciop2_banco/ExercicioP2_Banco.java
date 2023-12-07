package exerciciop2_banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExercicioP2_Banco {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        Clientes cli[] = lerDados();

        int opcao;

        do {
            System.out.println("Menu\n"
                    + "1 - Saldo\n"
                    + "2 - Depósito\n"
                    + "3 - Saque\n"
                    + "Digite a opção desejada: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo(cli, scan);
                    break;
                case 2:
                    realizarDeposito(cli, scan);
                    break;
                case 3:
                    realizarSaque(cli, scan);
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida!!");
                    break;

            }

        } while (opcao
                != 4);

    }

    public static Clientes[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Clientes cli[] = new Clientes[9];
        for (int i = 0; i < cli.length; i++) {
            cli[i] = new Clientes(scan.nextInt(), scan.nextInt(),
                    scan.next(), scan.nextDouble(), scan.nextDouble());
            System.out.printf("%10d %10d %10s %10.2f\n", cli[i].getConta(),
                    cli[i].getSenha(), cli[i].getCliente(), cli[i].getSaldo(), cli[i].getLimiteEspecial());

        }
        return cli;
    }

    private static void consultarSaldo(Clientes[] clientes, Scanner scanner) {
        System.out.println("Digite o numero da conta:");
        int numConta = scanner.nextInt();
        boolean contaEncontrada = false;

        for (Clientes cliente : clientes) {
            if (numConta == cliente.getConta()) {
                contaEncontrada = true;
                System.out.println("Digite a senha:");
                int senha = scanner.nextInt();

                if (cliente.verificaSenha(senha)) {
                    System.out.println("Saldo: " + cliente.getSaldo());
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            }
        }

        if (!contaEncontrada) {
            System.out.println("Conta inexistente!");
        }
    }

    private static void realizarDeposito(Clientes[] clientes, Scanner scanner) {
        System.out.println("Digite o numero da conta:");
        int numConta = scanner.nextInt();
        boolean contaEncontrada = false;

        for (Clientes cliente : clientes) {
            if (numConta == cliente.getConta()) {
                contaEncontrada = true;
                System.out.println("Digite a senha:");
                int senha = scanner.nextInt();

                if (cliente.verificaSenha(senha)) {
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    cliente.realizarDeposito(valorDeposito);
                    System.out.println("Depósito realizado com sucesso. Novo saldo: " + cliente.getSaldo());
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            }
        }

        if (!contaEncontrada) {
            System.out.println("Conta inexistente!");
        }
    }

    private static void realizarSaque(Clientes[] clientes, Scanner scanner) {
        System.out.println("Digite o numero da conta:");
        int numConta = scanner.nextInt();
        boolean contaEncontrada = false;

        for (Clientes cliente : clientes) {
            if (numConta == cliente.getConta()) {
                contaEncontrada = true;
                System.out.println("Digite a senha:");
                int senha = scanner.nextInt();

                if (cliente.verificaSenha(senha)) {
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    String resultadoSaque = cliente.relizarSaque(valorSaque);

                    System.out.println(resultadoSaque);
                    if (resultadoSaque.equals("Saque efetuado com sucesso")) {
                        System.out.println("Novo saldo: " + cliente.getSaldo());
                    }
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            }
        }

        if (!contaEncontrada) {
            System.out.println("Conta inexistente!");
        }
    }

}
