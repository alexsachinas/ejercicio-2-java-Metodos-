/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora2;



import javax.swing.JOptionpane;
public class Calculadora2 {
    

    public static void main(String[] args) {
        
        int n1=Integer.parseInt(joptionpane.showInputDialog("digita el numero 1"));
        
        int n2=Integer.parseInt(joptionpane.showInputDialog("Digita el numero 2"));
        
        Operaciones op = new Operaciones();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.division(n1, n2);
        op.porcentaje(n1, n2);
        op.mostrarResultados();
        
      
    }
}
