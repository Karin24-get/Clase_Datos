/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpersonaslseedtib;

/**
 *
 * @author Estudiante
 */
class Lista {
    Nodo primero;
    
    public boolean insertar(Object dato){
        Nodo nuevo;
        try{
            nuevo = new Nodo(dato);
        } catch (Exception e){
            return false;
        }
        if (this.primero == null){
                this.primero = nuevo;
        } else{
            Nodo último = this.primero;
            while (último.siguiente != null)
                último = último.siguiente;
            último.siguiente = nuevo;
        }
        return true;
    }

    void imprimir() {
       Nodo aux = this.primero;
        while (aux != null){
            System.out.println(aux.dato.toString());
            aux = aux.siguiente;
        }
    }
    
    
}
