/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reclamos;

import Ciudadanos.Cuidadano;
import Funcionario.Funcionario;
import java.time.LocalDate;

/**
 *
 * @author Eduard Salas Murillo
 */
public class Reclamo {
   private int codigo;
   private String descripcion;
   private LocalDate fecha;
   private Estado estado;
   private String categoria;
   private Cuidadano ciudadano;
   private Funcionario funcionario;

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public Cuidadano getCiudadano() {
        return ciudadano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Reclamo(int codigo, String descripcion, LocalDate fecha, String categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.categoria = categoria;
        this.ciudadano = ciudadano;
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Reclamo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", estado=" + estado + ", categoria=" + categoria + ", ciudadano=" + ciudadano + ", funcionario=" + funcionario + '}';
    }
   
}
