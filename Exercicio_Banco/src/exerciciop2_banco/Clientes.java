package exerciciop2_banco;

public class Clientes {

    private int conta;
    private int senha;
    private String cliente;
    private double saldo;
    private double limiteEspecial;

    public Clientes(int conta, int senha, String cliente, double saldo, double limiteEspecial) {
        this.conta = conta;
        this.senha = senha;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
    }

    public boolean verificaSenha(int sen) {
        return senha == sen;
    }

    public String verSaldo() {
        return "Nome: " + cliente + "\nSaldo: " + saldo;
    }

    public boolean haSaldo(double saque) {
        if (saldo >= saque) {
            return true;
        } else {
            return false;
        }
    }

    public String relizarSaque(double retirada) {
        if (saldo + limiteEspecial >= retirada) {
            saldo -= retirada;
            return "Saque efetuado com sucesso";
        } else {
            return "Saldo insuficiente";
        }
    }

    public String realizarDeposito(double deposito) {
        saldo += deposito;

        return "Depósito efetuado com sucesso.";
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
