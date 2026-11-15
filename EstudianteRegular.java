
public class EstudianteRegular extends Estudiante {

    private String carrera;

    public EstudianteRegular(String nombre, String matricula,
                             double calificacion1,
                             double calificacion2,
                             double calificacion3,
                             String carrera) {

        super(nombre, matricula, calificacion1,
              calificacion2, calificacion3);

        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Estudiante regular");
        System.out.println("Carrera: " + carrera);
    }

    public void mostrarInscripcion() {
        System.out.println(getNombre()
                + " esta inscrito en " + carrera);
    }
}
