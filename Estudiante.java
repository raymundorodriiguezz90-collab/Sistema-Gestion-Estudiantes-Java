
// Clase base que representa a un estudiante
public class Estudiante {

    // Atributos del estudiante
    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    // Constructor para inicializar los datos
    public Estudiante(String nombre, String matricula,
                      double calificacion1,
                      double calificacion2,
                      double calificacion3) {

        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion 1: " + calificacion1);
        System.out.println("Calificacion 2: " + calificacion2);
        System.out.println("Calificacion 3: " + calificacion3);
        System.out.println("Promedio: " + calcularPromedio());
    }

    // Métodos de acceso para las clases derivadas
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
}
