public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 250.0;
        double valorSolicitado = 170.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println(saldo);

    }
}