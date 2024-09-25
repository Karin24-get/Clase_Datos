/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpersonaslseedtib;

/**
 *
 * @author Estudiante
 */
class Nodo {
    Object dato;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    
}
