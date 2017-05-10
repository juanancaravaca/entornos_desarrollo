package proyecto_ed06;

/**
 * Clase empleado para la práctica de Entornos de desarrollo
 * @author Juan Antonio Martinez Gomez
 * @version 1.0
 */
public class Empleado {
    /**
     * Dni del empleado
     */
    private String dni;
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Dirección del empleado
     */
    private String direccion;
    /**
     * Cargo del empleado
     */
    private String cargo;
    /**
     * Número de hijos del empleado
     */
    private int numHijos;
    
    /**
     * Constructor de la clase Empleado
     * @param dni - Representa el DNI del empleado
     * @param nombre - Nombre y apellidos del empleado
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     * Método para el cálculo del sueldo del empleado a partir del sueldo base y del cargo
     * @param base - Sueldo base del empleado
     * @return sueldo bruto del empleado
     */
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}
