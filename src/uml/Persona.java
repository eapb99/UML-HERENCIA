/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.util.Date;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre;
    private char sexo;
    private Date fechaNac;
    private String profesion;
    
    public Persona(String nombre, char sexo, Date fechaNac, String profesion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.profesion = profesion;
    }
    
}
