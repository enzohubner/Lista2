package exercicio2;

public class ContaBancaria {
    public static Integer numero;
    public static Integer agencia;
    public static String cliente;
    public static double saldo;
    public static double chequeEspecial;

    public ContaBancaria() {
        numero = InOut.leInteger("Digite a numero: ");
        agencia = InOut.leInteger("Digite o agencia: ");
        cliente = InOut.leString("Digite o cliente cliente: ");
        saldo = InOut.leDouble("Digite o saldo: ");
        chequeEspecial = InOut.leDouble("Digite o chequeEspecial: ");
    }

    public void sacar(double retirada) {
        saldo = saldo - retirada;
        InOut.MsgDeInforma("Saque", "saldo restante: " + saldo);
    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
        InOut.MsgDeInforma("Deposito", "saldo restante: " + deposito);
    }

    public void consultarSaldo() {
        InOut.MsgDeInforma("Consulta de saldo", "saldo: " + saldo);
    }

    // @Override
    // public String toString() {
    // return "ContaBancaria []";
    // }

}
