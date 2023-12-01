public class Funcionarios {

    private String nome;
    private double salarioBase;
    private int numFilhos;

    public double salarioFinal() {
        double valor;
        if (salarioBase <= 1100) {
            valor = salarioBase + (70 * numFilhos);
        } else if (salarioBase <= 1550) {
            valor = salarioBase + (50 * numFilhos);
        } else {
            valor = salarioBase;
        }
        return valor;

    }

    public double aumentoSalario() {
        double aumento = 0;
        salarioBase *= (1 + aumento / 100);
        return salarioBase;
    }

    public Funcionarios(String nome, double salarioBase, int numFilhos) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numFilhos = numFilhos;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
