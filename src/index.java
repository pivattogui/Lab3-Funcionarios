

import funcionario.FuncionarioComissionado;
import funcionario.FuncionarioComissionadoBaseSalario;
import funcionario.FuncionarioHorista;

class index {
    public static void main(String[] args) {
        FuncionarioComissionado comissionado = new FuncionarioComissionado(
                "Funcionario 1",
                "999.999.999-99",
                13,
                10000);

        System.out.println(comissionado.toString());

        FuncionarioComissionadoBaseSalario comissionadoBaseSalario = new FuncionarioComissionadoBaseSalario(
                "Funcionario 2",
                "888.888.888-88",
                5,
                5000,
                1500);

        System.out.println(comissionadoBaseSalario.toString());

        FuncionarioHorista horista = new FuncionarioHorista(
                "Funcionario 3",
                "777.777.777-77",
                41,
                110.0);

        System.out.println(horista.toString());

    }
}