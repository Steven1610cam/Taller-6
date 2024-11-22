package banco;

public class Cuenta extends Banco {
    private String titular;

    public Cuenta(String titular, double saldoInicial) {
        super(saldoInicial);
        this.titular = titular;
    }

  
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        mostrarSaldo(); 
    }
}