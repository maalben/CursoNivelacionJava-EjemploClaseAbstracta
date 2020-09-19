package clases;

public class EmpleadoGerentes extends Empleado {

    private double porcentajePension;
    private double porcentajeSalud;

    public EmpleadoGerentes(String nombre, double cantidadHoras, double valorHora) {
        super(nombre, cantidadHoras, valorHora);
    }

    public double getPorcentajePension() {
        return porcentajePension;
    }

    public void setPorcentajePension(double porcentajePension) {
        this.porcentajePension = porcentajePension;
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = this.getCantidadHoras() * this.getValorHora();
        double descuentoSalud = salarioBase * (this.getPorcentajeSalud() / 100);
        double descuentoPension = salarioBase * (this.getPorcentajePension() / 100);
        return (salarioBase - (descuentoSalud + descuentoPension));
    }
}
