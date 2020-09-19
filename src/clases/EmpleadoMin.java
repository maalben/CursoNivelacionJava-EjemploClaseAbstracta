package clases;

public class EmpleadoMin extends Empleado {

    public EmpleadoMin(String nombre, double cantidadHoras, double valorHora) {
        super(nombre, cantidadHoras, valorHora);
    }

    @Override
    public double calcularSalario() {
        return (this.getCantidadHoras() * this.getValorHora());
    }
}
