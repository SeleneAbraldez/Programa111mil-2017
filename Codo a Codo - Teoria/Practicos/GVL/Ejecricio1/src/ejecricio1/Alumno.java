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
public class Alumno {   
    
    private String nombre;
    private String apellido; 
 
    public String getNombre ()    
    {     
        return this.nombre;
    }    
 
     public void setNombre (String nombre)    
     {    
         this.nombre = nombre;
     }    
 
     public String getApellido ()    
     {     
         return this.apellido;
     }    
 
     public void setApellido (String apellido)    
     {     
         this.apellido = apellido;
     }   
     public String getNombreCompleto ()
     {     return this.nombre + " " + this.apellido;   } 


}