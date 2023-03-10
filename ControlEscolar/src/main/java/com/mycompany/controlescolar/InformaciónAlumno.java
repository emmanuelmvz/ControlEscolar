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
public class InformaciónAlumno {
    Scanner stdIn = new Scanner(System.in);
    String nombre; //solo nombre 
    String apellidoP; //apellido paterno 
    String apellidoM; //apellido materno 
        String nombreDelAlumno;
    String fechaDeNacimiento;
        int dia; int mes; int año;
    double telefono;
    String direccion;
    double numeroDeCuenta;
    int semestre;
    String horario = "Lunes y Miercoles "+"\n"
            +"7:00-9:00 Sistemas"+"\n"
            + "9:00-10:30 Circuitos"+"\n"
            + "11:00-12:30 Algoritmos"+"\n"
            + "  "+"\n"
            + "Martes y Jueves"+"\n"
            + "7:00-9:00 Calculo "+"\n"
            + "10:00-12:30 Programación"+"\n";
           
    public void InformacionPersonal (){
        System.out.println("Introduzca el nombre y apellidos separados por un espacio : " );
        nombre=stdIn.next();
        apellidoP=stdIn.next();
        apellidoM=stdIn.next();
        nombreDelAlumno=(nombre+" "+apellidoP+" "+apellidoM+".");
        
        System.out.println("Introduzca la fecha de nacimiento separado por un espacio y empezando por el dia (DD MM AAAA): ");
        dia=stdIn.nextInt();
        mes=stdIn.nextInt();
        año=stdIn.nextInt();
        fechaDeNacimiento=(dia+"/"+mes+"/"+año);
        
        System.out.println("Ingrese su número telefónico : ");
        telefono=stdIn.nextDouble();
        
        System.out.println("Ingrese su dirección: ");
        direccion=stdIn.next();
        
        System.out.print("El nombre completo del alumno es: "+nombreDelAlumno+"\n");
        System.out.print("La fecha de nacimiento del alumno es: "+fechaDeNacimiento+"\n");
        System.out.print("El teléfono del alumno es: "+telefono+"\n");        
        System.out.print("La dirección de domicilio del alumno es: "+direccion+"\n");
    }
    
    public void InformacionAcademica (){
        System.out.println("Ingrese su número de cuenta: ");
        numeroDeCuenta=stdIn.nextInt();
        System.out.println("El semestre que esta cursando es: ");
        semestre=stdIn.nextInt();
        
        System.out.print("El numero de cuenta del alumno es: "+numeroDeCuenta+"\n");
        System.out.print("El semestre que está cursando el alumno es: "+semestre+"\n");
    }
    
    public void Horarios(){
        System.out.println("Su horario es: "+ horario);
    }
}


