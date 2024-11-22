package vehiculos;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    
    protected void mostrarInformacion() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}