package princiapl;

public class GestorPersonasLSEEDTIB {

    public static void main(String[] args) {
        // Crear una instancia de GestorPersonas
        GestorPersonas gestor = new GestorPersonas();

        // Crear algunas personas
        Persona persona1 = new Persona("12345678", "Juan Pérez");
        Persona persona2 = new Persona("87654321", "Ana García");
        Persona persona3 = new Persona("11223344", "Luis Martínez");

        // Insertar personas al final de la lista
        System.out.println("Insertando personas al final:");
        gestor.insertarUltimo(persona1);
        gestor.insertarUltimo(persona2);
        gestor.insertarUltimo(persona3);
        gestor.imprimir();  // Imprimir la lista de personas

        // Insertar una persona al principio
        System.out.println("\nInsertando una persona al principio:");
        Persona persona4 = new Persona("99887766", "María López");
        gestor.insertarPrimero(persona4);
        gestor.imprimir();  // Imprimir la lista de personas

        // Insertar una persona en una posición específica
        System.out.println("\nInsertando una persona en la posición 2:");
        Persona persona5 = new Persona("55443322", "Carlos Fernández");
        gestor.insertarPorPosicion(persona5, 2);  // Insertar en la posición 2 (índice 1)
        gestor.imprimir();  // Imprimir la lista de personas

        // Borrar la primera persona
        System.out.println("\nBorrando la primera persona:");
        gestor.borrarPrimero();
        gestor.imprimir();  // Imprimir la lista de personas

        // Borrar la última persona
        System.out.println("\nBorrando la última persona:");
        gestor.borrarUltimo();
        gestor.imprimir();  // Imprimir la lista de personas

        // Borrar una persona en una posición específica
        System.out.println("\nBorrando la persona en la posición 1:");
        gestor.borrarPorPosicion(1);  // Borrar la persona en la posición 1
        gestor.imprimir();  // Imprimir la lista de personas
    }
}
