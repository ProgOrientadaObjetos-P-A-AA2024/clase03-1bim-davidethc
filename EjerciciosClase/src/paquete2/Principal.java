/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        /*Un objeto de tipo InstitucionEducativa*/
        InstitucionEducativa i1 = new InstitucionEducativa();
        String nombre = "Daniel Alvarez Burneo";
        String tipoInstitucion = "Privada";
        int numeroAlumnos = 200;
        int numeroDocentes = 30;
        int numeroSedes = 3;
        
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNombre(nombre);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);

        // System.out.printf("%s     ", i1.);
         System.out.printf("Institucion Educativa\n\naTipo de institucion:%s\n Nombres Completos: %s\n"
                + "Numero de Alumnos%s\n "+"Numero de Alumnos%s\n"+"Numero de sedes %s\n",i1.obtenerTipoInstitucion(),i1.obtenerNombre(),i1.obtenerNumeroAlumnos(),i1.obtenerNumeroDocentes(),i1.obtenerNumeroSedes());
    }
}
