/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Reclamos;

/**
 *
 * @author Eduard Salas Murillo
 */
public enum Estado {
    PENDIENTE("Pendiente"),
    PROCESO ("Proceso") ,   
    RESUELTO("Resuelto") ;
    
    public String estado;
  
    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Estado{" + "estado=" + estado + '}';
    }

    
    
    
    
    
}
