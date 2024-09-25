package princiapl;

class Lista {
    Nodo primero;

    // Insertar al final
    public boolean insertarUltimo(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            Nodo ultimo = this.primero;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevo;
        }
        return true;
    }

    // Insertar al principio
    public boolean insertarPrimero(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = this.primero;
        this.primero = nuevo;
        return true;
    }

    // Insertar por posición
    public boolean insertarPorPosicion(Object dato, int posicion) {
        if (posicion < 0) return false;  // Posiciones negativas no válidas

        Nodo nuevo = new Nodo(dato);
        if (posicion == 0) {  // Insertar al principio
            nuevo.siguiente = this.primero;
            this.primero = nuevo;
            return true;
        }

        Nodo actual = this.primero;
        for (int i = 1; i < posicion && actual != null; i++) {
            actual = actual.siguiente;
        }

        if (actual == null) return false;  // Posición fuera de los límites

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
        return true;
    }

    // Borrar al último
    public boolean borrarUltimo() {
        if (this.primero == null) return false;  // Lista vacía

        if (this.primero.siguiente == null) {  // Solo un elemento
            this.primero = null;
            return true;
        }

        Nodo penultimo = this.primero;
        while (penultimo.siguiente.siguiente != null) {
            penultimo = penultimo.siguiente;
        }
        penultimo.siguiente = null;
        return true;
    }

    // Borrar al primero
    public boolean borrarPrimero() {
        if (this.primero == null) return false;  // Lista vacía

        this.primero = this.primero.siguiente;
        return true;
    }

    // Borrar por posición
    public boolean borrarPorPosicion(int posicion) {
        if (posicion < 0 || this.primero == null) return false;

        if (posicion == 0) {  // Borrar el primero
            this.primero = this.primero.siguiente;
            return true;
        }

        Nodo actual = this.primero;
        for (int i = 1; i < posicion && actual.siguiente != null; i++) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) return false;  // Posición fuera de los límites

        actual.siguiente = actual.siguiente.siguiente;
        return true;
    }

    // Método para imprimir la lista
    void imprimir() {
        Nodo aux = this.primero;
        while (aux != null) {
            System.out.println(aux.dato.toString());
            aux = aux.siguiente;
        }
    }

}//FINAL CLASS
