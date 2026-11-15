
public class EstudianteBecado extends Estudiante {

    private double porcentajeBeca;

    public EstudianteBecado(String nombre, String matricula,
                            double calificacion1,
                            double calificacion2,
                            double calificacion3,
                            double porcentajeBeca) {

        super(nombre, matricula, calificacion1,
              calificacion2, calificacion3);

        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Estudiante becado");
        System.out.println("Beca: " + porcentajeBeca + "%");
    }

    public double calcularDescuento(double costoSemestral) {
        return costoSemestral * porcentajeBeca / 100;
    }
}
