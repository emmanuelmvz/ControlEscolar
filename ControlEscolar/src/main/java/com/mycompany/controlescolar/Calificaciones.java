/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlescolar;

import java.util.Scanner;

/**
 *
 * @author Emmanuel
 */
public class Calificaciones {
    Scanner stdIn = new Scanner(System.in);
    String materia1,
           materia2,
           materia3,
           materia4,
           materia5;
    double cal1,cal2, cal3, cal4, cal5, promedio;
    
    
    public void Materias(){
       System.out.print("Introduzca su primer materia ");
       materia1=stdIn.next();
       System.out.print("Introduzca su segunda materia ");
       materia2=stdIn.next();
       System.out.print("Introduzca su tercera materia ");
       materia3=stdIn.next();
       System.out.print("Introduzca su cuarta materia ");
       materia4=stdIn.next();
       System.out.print("Introduzca su quinta materia ");
       materia5=stdIn.next();
       
       System.out.print("Sus materias son: " + materia1 + "\n" + materia2 + "\n"+ materia3 + "\n"+ materia4 + "\n"+ materia5 + "\n");
        
    }
    
    public void Promedio (){
        System.out.print("La calificación de "+materia1+" es ");
        cal1=stdIn.nextDouble();
        System.out.print("La calificación de "+materia2+" es ");
        cal2 = stdIn.nextDouble();        
        System.out.print("La calificación de "+materia3+" es ");
        cal3= stdIn.nextDouble();
        System.out.print("La calificación de " + materia4 + " es ");
        cal4 = stdIn.nextDouble();        
        System.out.print("La calificación de "+materia5+" es ");
        cal5 = stdIn.nextDouble();
        
        promedio=(cal1+cal2+cal3+cal4+cal5)/5;
        System.out.print("\n");
        System.out.print("El promedio del alumno es: "+promedio);
        
    }
}
