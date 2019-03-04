/*
 1.Podemos meter el builder dentro de la clase empleado o fuera de esta clase.
 */
package builder_pattern;

/**
 *
 * @author finfanterodal
 */
public class Empleado {
//Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dia;
    private int mes;
    private int anho;
    private int altura;
    private int pie;
    private int dias;
    private int sueldo;
    private String dni;
    private String cargo;
    private String formacion;
 

//En el constructor los parámetros se describen como final para que no se le pueda cambiar el parámetro asignado   
    public Empleado(final String nombre,final String apellido1,final String apellido2,final int dia,final int mes,final int anho,final int altura,final int pie,final int dias,final int sueldo,final String dni,final String cargo,final String formacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
        this.altura = altura;
        this.pie = pie;
        this.dias = dias;
        this.sueldo = sueldo;
        this.dni = dni;
        this.cargo = cargo;
        this.formacion = formacion;
    }
    
}
