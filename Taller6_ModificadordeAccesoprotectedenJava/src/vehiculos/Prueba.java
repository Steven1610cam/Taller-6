// Clase de prueba
package vehiculos;

public class Prueba {
    public static void main(String[] args) {
        // Creando un objeto de la clase Moto
        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        
        // Mostrando información de la moto
        System.out.println("Información de la Moto:");
        moto.mostrarInformacion(); // Muestra información de la moto

        // Intentando acceder a los miembros protected desde una clase no relacionada
        // Esto generará un error de compilación si se descomenta
        /*
        System.out.println("Tipo de vehículo: " + moto.tipo); // Error de compilación
        System.out.println("Marca de vehículo: " + moto.marca); // Error de compilación
        */
    }
}