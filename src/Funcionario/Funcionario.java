/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author Student
 */
public class Funcionario {
    protected int cedula;
    protected String nombre;
    protected String cargo;
    protected String unidad;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Funcionario(int cedula, String nombre, String cargo, String unidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cedula=" + cedula + ", nombre=" + nombre + ", cargo=" + cargo + ", unidad=" + unidad + '}';
    }
    
    
    
}
