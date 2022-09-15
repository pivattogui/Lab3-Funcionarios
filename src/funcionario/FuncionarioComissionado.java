package funcionario;

public class FuncionarioComissionado extends Funcionario {
    private double taxaComissao, vendasBrutas;

    public FuncionarioComissionado(String nome, String cpf, double taxaComissao, double vendasBrutas) {
        super(nome, cpf);
        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    public double getRendimentos() {
        double rendimento = (taxaComissao / 100) * vendasBrutas;

        return rendimento;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public String toString() {
        return "Funcionário: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nSalário: R$" + getRendimentos();
    }
}
