/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern;


public class EmpleadoBuilder {

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

    public EmpleadoBuilder() {
    }
    
    
    public EmpleadoBuilder(String nombre, String apellido1, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }
    
    public EmpleadoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder setApellido1(String apellido1) {
        this.apellido1 = apellido1;
        return this;
    }

    public EmpleadoBuilder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilder setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilder setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilder setAnho(int anho) {
        this.anho = anho;
        return this;
    }

    public EmpleadoBuilder setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilder setPie(int pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilder setDias(int dias) {
        this.dias = dias;
        return this;
    }

    public EmpleadoBuilder setSueldo(int sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadoBuilder setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public EmpleadoBuilder setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilder setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dia, mes, anho, altura, pie, dias, sueldo, dni, cargo, formacion);
    }
    
}
