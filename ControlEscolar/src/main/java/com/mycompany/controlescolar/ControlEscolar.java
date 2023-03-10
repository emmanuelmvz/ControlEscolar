/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlescolar;

/**
 *
 * @author Emmanuel
 */
public class ControlEscolar {

    public static void main(String[] args) {
        InformaciónAlumno mod1 = new InformaciónAlumno();
        mod1.InformacionPersonal();
        mod1.InformacionAcademica();
        mod1.Horarios();
        
        Calificaciones mod2 =new Calificaciones();
        mod2.Materias();
        mod2.Promedio();
    }
}
