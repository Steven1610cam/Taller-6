package banco;

public class Prueba {
    public static void main(String[] args) {
        // Creando un objeto de la clase Cuenta
        Cuenta cuenta = new Cuenta("Juan Pérez", 1000.0);

        // Mostrando información de la cuenta
        System.out.println("Información de la Cuenta:");
        cuenta.mostrarInformacion(); // Muestra información de la cuenta

        // Intentando acceder al saldo desde una clase no relacionada
        // Esto generará un error de compilación si se descomenta
        /*
        System.out.println("Saldo de la cuenta: " + cuenta.saldo); // Error de compilación
        */
    }

//*****************************************************************************************************************
//Mejora de la Implementación
//Para mejorar la seguridad, podríamos hacer lo siguiente:

//Cambiar el modificador de acceso a private: Esto evitaría que cualquier subclase acceda directamente al saldo.
//Proporcionar métodos públicos para acceder y modificar el saldo: Esto permite un control más estricto sobre cómo se modifica el saldo.