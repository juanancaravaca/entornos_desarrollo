/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ed06;


/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
        
        Empleado empleado2 = new Empleado("77584362K","Fernando Sanchez");
        empleado2.setDireccion("C/Mayor,18");
        empleado2.setNumHijos(0);
        
        imprimir_emp(empleado1);
        imprimir_emp(empleado2);
    }

    public static void imprimir_emp(Empleado empleado1) {
        System.out.println("DNI: "+empleado1.getDni());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("Número de hijos: "+empleado1.getNumHijos());
        System.out.println("Sueldo: "+empleado1.calcula_sueldo(1200));
    }
    
}
