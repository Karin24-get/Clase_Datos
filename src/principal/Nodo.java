package principal;

public class Nodo {
    Object dato;         // El dato que almacena el nodo
    Nodo siguiente;      // Referencia al siguiente nodo en la lista

    // Constructor que inicializa el nodo con un dato
    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null; // El siguiente nodo inicialmente es null
    }

    // Constructor que inicializa el nodo con un dato y referencia a un siguiente nodo
    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente; // El siguiente nodo se asigna explícitamente
    }

    // Método para obtener el dato del nodo
    public Object getDato() {
        return this.dato;
    }

    // Método para establecer el dato del nodo
    public void setDato(Object dato) {
        this.dato = dato;
    }

    // Método para obtener el siguiente nodo
    public Nodo getSiguiente() {
        return this.siguiente;
    }

    // Método para establecer el siguiente nodo
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}// FINAL CLASS
