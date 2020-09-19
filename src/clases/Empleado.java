package clases;

public abstract class Empleado {

    private String nombre;
    private double cantidadHoras;
    private double valorHora;

    public Empleado(String nombre, double cantidadHoras, double valorHora){
        this.nombre = nombre;
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }

    public abstract double calcularSalario(); //Especie de contrato

    protected String getNombre() {
        return nombre;
    }

    protected double getCantidadHoras() {
        return cantidadHoras;
    }

    protected double getValorHora() {
        return valorHora;
    }
}
