package banco;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    protected void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
