package builder_pattern;

/**
 *
 * @author Fran
 */
public class COD_Builder_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos un builder con los obligatorios más los sets que quiera y a continuación creo el empleado y lo devuelvo
        Empleado jefeTaller = new EmpleadoBuilder("Pepe", "Villuela", "43")
                .setApellido2("Rodriguez")
                .setDias(10)
                .createEmpleado();
        Empleado operario = new EmpleadoBuilder("Josito", "Gómez", "46")
                .setApellido2("Rodal")
                .createEmpleado();
    }

}
