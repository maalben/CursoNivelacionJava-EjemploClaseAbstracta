package clases;

public class EmpleadoAdmin extends Empleado {

    private double porcentajeSalud;

    public EmpleadoAdmin(String nombre, double cantidadHoras, double valorHora) {
        super(nombre, cantidadHoras, valorHora);
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }

    @Override
    public double calcularSalario() {
        return ( (this.getCantidadHoras() * this.getValorHora()) - ( (this.getCantidadHoras() * this.getValorHora()) * (this.getPorcentajeSalud() / 100) ) );
    }
}
