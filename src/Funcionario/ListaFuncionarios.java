/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author Student
 */
public class ListaFuncionarios implements MetodosComportamientoGenerico {

        private Funcionario Funcionarios[];
    
    
    public boolean add(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean remove(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Object find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    public int ListaFuncionarios(String CargoIngresado){
        int contador = 0;
        for(int i = 0; i<Funcionarios.length; i++){
            if(Funcionarios[i] != null && Funcionarios[i].getCargo().equalsIgnoreCase(CargoIngresado)){
                contador = contador + 1;
                return contador;
            }
        }
            return 0;
    }
        
 
}    

