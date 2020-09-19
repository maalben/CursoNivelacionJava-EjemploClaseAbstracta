package main;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import clases.EmpleadoAdmin;
import clases.EmpleadoGerentes;
import clases.EmpleadoMin;

public class Main {

    public static void main(String [] args){

        EmpleadoMin empleadoMin = new EmpleadoMin("Pedro Pablo", 48, 20000);
        System.out.println("El salario a pagar es: " + empleadoMin.calcularSalario());

        EmpleadoAdmin empleadoAdmin = new EmpleadoAdmin("Chilindrina", 96, 30000);
        empleadoAdmin.setPorcentajeSalud(4);
        System.out.println("El salario a pagar es " + empleadoAdmin.calcularSalario());

        EmpleadoGerentes empleadoGerentes = new EmpleadoGerentes("Don Ramón", 200, 40000);
        empleadoGerentes.setPorcentajeSalud(5);
        empleadoGerentes.setPorcentajePension(5);
        System.out.println("El salario a pagar es " + empleadoGerentes.calcularSalario());
    }

}
