// Clase principal del Sistema de Gestión de Estudiantes
public class Principal {

    // Método principal: punto de inicio del programa
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("Sistema de Gestión de Estudiantes");
        System.out.println("==========================================");

        // Instaniación de objetos mediante el constructor
        Estudiante estudiante1 = new Estudiante(
                        "Carlos Ramirez", "2026001", 90, 85, 95

        );
        
        Estudiante estudiante2 = new Estudiante(
            "Ana Torres", "2026002", 88, 92, 96
        );

        Estudiante estudiante3 = new Estudiante(
            "Luis Fernandez", "2026003", 75, 80, 85
        );
        
        // Llamada a los métodos de cada objeto 
        System.out.println("\nESTUDIANTES REGISTRADOS:");
        System.out.println("-------------------------");

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        System.out.println("Programa ejecutado correctamente.");
    }
}



