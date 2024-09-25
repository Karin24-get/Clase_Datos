package principal;

class GestorPersonas {
    Lista personas;  // Lista de personas

    // Constructor
    public GestorPersonas() {
        this.personas = new Lista();  // Inicializa la lista de personas
    }

    // Inserta una persona al final de la lista
    public boolean insertarUltimo(Persona persona) {
        return this.personas.insertarUltimo(persona);  // Usa insertarUltimo de Lista
    }

    // Inserta una persona al principio de la lista
    public boolean insertarPrimero(Persona persona) {
        return this.personas.insertarPrimero(persona);  // Usa insertarPrimero de Lista
    }

    // Inserta una persona en una posición específica de la lista
    public boolean insertarPorPosicion(Persona persona, int posicion) {
        return this.personas.insertarPorPosicion(persona, posicion);  // Usa insertarPorPosicion de Lista
    }

    // Imprimir la lista de personas
    public void imprimir() {
        this.personas.imprimir();  // Usa el método imprimir de la clase Lista
    }

    // Imprimir detalles de cada persona en la lista
    public void imprimirDetalles() {
        this.personas.imprimirDetalles();  // Usa el método imprimirDetalles de la clase Lista
    }

    // Borra la última persona de la lista
    public boolean borrarUltimo() {
        return this.personas.borrarUltimo();  // Usa borrarUltimo de Lista
    }

    // Borra la primera persona de la lista
    public boolean borrarPrimero() {
        return this.personas.borrarPrimero();  // Usa borrarPrimero de Lista
    }

    // Borra una persona por posición
    public boolean borrarPorPosicion(int posicion) {
        return this.personas.borrarPorPosicion(posicion);  // Usa borrarPorPosicion de Lista
    }
}
