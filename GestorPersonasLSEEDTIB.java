/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorpersonaslseedtib;

/**
 *
 * @author Estudiante
 */
public class GestorPersonasLSEEDTIB {

    public static void main(String[] args) {
      GestorPersonas g = new GestorPersonas();
      g.insertar(new Persona("0939374784", "José Acurio"));
      g.insertar(new Persona("1739374784", "María de los Jazminez"));
      g.imprimir();
    }
}
