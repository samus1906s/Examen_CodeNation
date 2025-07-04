/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciudadanos;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Cuidadano {
    private int id; 
    private int cedula;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String correo;
    private String telefono;

    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cuidadano(int id, int cedula, String nombre, String correo, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        if(!fecha_nacimiento.isAfter(LocalDate.now())){
        }
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cuidadano{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
