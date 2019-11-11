/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecricio1;

/**
 *
 * @author Profesor
 */
public class Ejecricio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno1 = new Alumno(); 
        alumno1.setNombre("Pablo"); 
        alumno1.setApellido("Filippo"); 
 
        Alumno alumno2 = new Alumno(); 
        alumno2.setNombre("Florencia"); 
        alumno2.setApellido("Venne"); 
 
        System.out.println("Nombre del alumno 1: " + alumno1.getNombreCompleto()); 
        System.out.println("Nombre del alumno 2: " + alumno2.getNombreCompleto());
    }
    
}
