package principal;

public class GestorPersonasLSEEDTIB {

    public static void main(String[] args) {
        // Crear una instancia de GestorPersonas
        GestorPersonas gestor = new GestorPersonas();

        // Crear algunas personas
        Persona persona1 = new Persona("12345678", "Juan Perez");
        Persona persona2 = new Persona("87654321", "Ana Garcia");
        Persona persona3 = new Persona("11223344", "Luis Martinez");

        // Insertar personas al final de la lista
        System.out.println("=== Insertando personas al final ===");
        gestor.insertarUltimo(persona1);
        gestor.insertarUltimo(persona2);
        gestor.insertarUltimo(persona3);
        System.out.println("Lista de personas después de inserciones:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        // Insertar una persona al principio
        System.out.println("\n=== Insertando una persona al principio ===");
        Persona persona4 = new Persona("99887766", "María López");
        gestor.insertarPrimero(persona4);
        System.out.println("Lista de personas después de insertar al principio:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        // Insertar una persona en una posición específica
        System.out.println("\n=== Insertando una persona en la posición 2 ===");
        Persona persona5 = new Persona("55443322", "Carlos Fernández");
        gestor.insertarPorPosicion(persona5, 2);  // Insertar en la posición 2 (índice 1)
        System.out.println("Lista de personas después de la inserción:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        // Borrar la primera persona
        System.out.println("\n=== Borrando la primera persona ===");
        gestor.borrarPrimero();
        System.out.println("Lista de personas después de borrar la primera:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        // Borrar la última persona
        System.out.println("\n=== Borrando la última persona ===");
        gestor.borrarUltimo();
        System.out.println("Lista de personas después de borrar la última:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        // Borrar una persona en una posición específica
        System.out.println("\n=== Borrando la persona en la posición 1 ===");
        gestor.borrarPorPosicion(1);  // Borrar la persona en la posición 1
        System.out.println("Lista de personas después de borrar en la posición 1:");
        gestor.imprimir();  // Imprimir la lista de personas
        System.out.println("Detalles de la lista:");
        gestor.imprimirDetalles();

        System.out.println("\n=== Fin del programa ===");
    }
}
