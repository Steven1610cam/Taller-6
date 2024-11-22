package empleados;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 3000);
        Gerente gerente = new Gerente("Ana", 5000, "Recursos Humanos");

        System.out.println("Información del Empleado:");
        empleado.mostrarInformacion();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInformacion();
    }
}