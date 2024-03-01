/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;

import javax.swing.JOptionPane;

public class Operaciones {

    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int porcentaje;
    
    //Metodos
    
    public void leerNumeros(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("coloca el núm 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("coloca el núm 2"));       
    }
    //Metodo de suma
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
    }
    
    //Metodo de resta
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }
    
    //metodo de multiplicacion
    public void multiplicar(int numero1,int numero2){
        multiplicacion=numero1*numero2;
    }
    
    //Metodo de resta
    public void division(int numero1,int numero2){
        division=numero1/numero2;
    }
    
    //Metodo de porcentaje
    public void porcentaje(int numero1,int numero2){
        porcentaje=(numero1/numero2)*100;
    }
    
        //Muestra resultados    
      public void mostarResusltados(){
          System.out.print("La suma es: " + suma);
          
          System.out.print("La resta es: " + resta);
          
          System.out.print("La multiplicacion es: " + multiplicacion);
          
          System.out.print("La division es: " + division);
          
          System.out.print("El porcentaje es: " + porcentaje);
      }
}

   
    
    
    

   