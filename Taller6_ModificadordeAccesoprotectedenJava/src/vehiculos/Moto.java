package vehiculos;

public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    
    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}