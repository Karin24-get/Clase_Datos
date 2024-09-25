/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpersonaslseedtib;

/**
 *
 * @author Estudiante
 */
class Persona {
    String ci, nombre;
    Persona siguiente; //innatura

    public Persona(String ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
        this.siguiente = null;
    }

    public Persona(String ci, String nombre, Persona siguiente) {
        this.ci = ci;
        this.nombre = nombre;
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return "Cédula: " + this.ci + "   Nombre: " + this.nombre;
    }
    
    
}
