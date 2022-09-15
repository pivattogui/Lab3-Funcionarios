package funcionario;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadaSemanal;
    private double valorHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadaSemanal, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadaSemanal = horasTrabalhadaSemanal;
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadaSemanal(int horasTrabalhadaSemanal) {
        this.horasTrabalhadaSemanal = horasTrabalhadaSemanal;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        double salario = 0;

        if (horasTrabalhadaSemanal < 40) {
            salario = horasTrabalhadaSemanal * valorHora;
            return salario;
        }

        salario = 40 * valorHora;

        double horaExtra = (horasTrabalhadaSemanal - 40) * (valorHora * 1.5);

        return salario + horaExtra;
    }

    public String toString() {
        return "Funcionário: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nSalário: R$" + getSalario();
    }
}
