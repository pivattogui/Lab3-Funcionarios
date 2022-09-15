package funcionario;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salario;

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, double taxaComissao, double vendasBrutas, double salario) {
        super(nome, cpf, taxaComissao, vendasBrutas);
        this.salario = salario;
    }

    public double getRendimentos(){
        return (super.getRendimentos() + salario);
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Funcionário: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nSalário: R$" + getRendimentos();
    }
}
