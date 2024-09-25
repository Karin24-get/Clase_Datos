/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpersonaslseedtib;

/**
 *
 * @author Estudiante
 */
class GestorPersonas {
    Lista personas;

    public GestorPersonas() {
        this.personas = new Lista();
    }

    public boolean insertar(Persona persona) {
        return this.personas.insertar(persona);
    }

    void imprimir() {
        this.personas.imprimir();
    }
}
