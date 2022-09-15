package funcionario;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String cpf, double salarioSemanal) {
        super(nome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioMensal() {
        return salarioSemanal * 4;
    }

    public String toString() {
        return "Funcionário: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nSalário: R$" + getSalarioMensal();
    }
}
