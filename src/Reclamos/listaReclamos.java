/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reclamos;

/**
 *
 * @author Student
 */
public class listaReclamos {
    
    private int [] ListRec = new int [100];
    
    public double porcentajeReclamos(int codigo, double porcent){
        for (int i = 0; i < ListRec.length; i++){
            if (ListRec[i] == codigo){
                return codigo;
            }
        }
        return porcent;
    }
    
}
