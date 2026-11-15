
public class Principal {

    public static void main(String[] args) {

        // Estudiantes que heredan de la clase Estudiante
        EstudianteRegular estudiante1 =
                new EstudianteRegular(
                        "Carlos Ramirez", "2026001",
                        90, 85, 95,
                        "Ingenieria en Sistemas");

        EstudianteRegular estudiante2 =
                new EstudianteRegular(
                        "Luis Fernandez", "2026003",
                        75, 80, 85,
                        "Administracion");

        EstudianteBecado estudiante3 =
                new EstudianteBecado(
                        "Ana Torres", "2026002",
                        88, 92, 96,
                        50);

        System.out.println("=== SISTEMA DE GESTION DE ESTUDIANTES ===");

        System.out.println("\n=== ESTUDIANTE 1 ===");
        estudiante1.mostrarInformacion();
        estudiante1.mostrarInscripcion();

        System.out.println("\n=== ESTUDIANTE 2 ===");
        estudiante2.mostrarInformacion();
        estudiante2.mostrarInscripcion();

        System.out.println("\n=== ESTUDIANTE 3 ===");
        estudiante3.mostrarInformacion();

        System.out.println("\n=== BENEFICIO DE BECA ===");
        double descuento =
                estudiante3.calcularDescuento(10000);

        System.out.println("Descuento: $" + descuento);

        System.out.println("\nPrograma ejecutado correctamente.");
    }
}
