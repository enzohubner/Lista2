package exercicio1;

public class Funcionario {
    public static Integer cpf;
    public static String nome;
    public static double horasTrab;
    public static double valorHora;
    public static double horaExat;

    public Funcionario() {
        cpf = InOut2.leInteger("Digite a cpf: ");
        nome = InOut2.leString("Digite o nome: ");
        horasTrab = InOut2.leDouble("Digite as horas trabalhadas: ");
        valorHora = InOut2.leDouble("Digite o valor da hora: ");
        horaExat = InOut2.leDouble("Digite as horas exatas: ");
    }

    public void calculaSalario() {
        double valor = valorHora * (horasTrab + horaExat);
        InOut2.MsgDeInforma("Valor final do salario: ", "Resultado: " + valor);
    }

    // @Override
    // public String toString() {
    // return "Funcionario: ";
    // }

}
