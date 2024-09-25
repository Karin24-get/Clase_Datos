package principal;

class Lista {
    Nodo primero;

    // Insertar al final
    public boolean insertarUltimo(Object dato) {
        try {
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
        } catch (Exception e) {
            System.err.println("Error al insertar al final: " + e.getMessage());
            return false;
        }
    }

    // Insertar al principio
    public boolean insertarPrimero(Object dato) {
        try {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = this.primero;
            this.primero = nuevo;
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar al principio: " + e.getMessage());
            return false;
        }
    }

    // Insertar por posición
    public boolean insertarPorPosicion(Object dato, int posicion) {
        if (posicion < 0) {
            System.err.println("Posición no válida: debe ser un valor mayor o igual a 0.");
            return false;
        }

        try {
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

            if (actual == null) {
                System.err.println("Posición fuera de los límites de la lista.");
                return false;
            }

            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar por posición: " + e.getMessage());
            return false;
        }
    }

    // Borrar al último
    public boolean borrarUltimo() {
        if (this.primero == null) {
            System.err.println("Error: la lista está vacía.");
            return false;
        }

        try {
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
        } catch (Exception e) {
            System.err.println("Error al borrar el último nodo: " + e.getMessage());
            return false;
        }
    }

    // Borrar al primero
    public boolean borrarPrimero() {
        if (this.primero == null) {
            System.err.println("Error: la lista está vacía.");
            return false;
        }

        try {
            this.primero = this.primero.siguiente;
            return true;
        } catch (Exception e) {
            System.err.println("Error al borrar el primer nodo: " + e.getMessage());
            return false;
        }
    }

    // Borrar por posición
    public boolean borrarPorPosicion(int posicion) {
        if (posicion < 0 || this.primero == null) {
            System.err.println("Posición no válida o la lista está vacía.");
            return false;
        }

        try {
            if (posicion == 0) {  // Borrar el primero
                this.primero = this.primero.siguiente;
                return true;
            }

            Nodo actual = this.primero;
            for (int i = 1; i < posicion && actual.siguiente != null; i++) {
                actual = actual.siguiente;
            }

            if (actual.siguiente == null) {
                System.err.println("Posición fuera de los límites de la lista.");
                return false;
            }

            actual.siguiente = actual.siguiente.siguiente;
            return true;
        } catch (Exception e) {
            System.err.println("Error al borrar por posición: " + e.getMessage());
            return false;
        }
    }

    // Método para imprimir la lista
    public void imprimir() {
        if (this.primero == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo aux = this.primero;
        while (aux != null) {
            System.out.println(aux.dato.toString());
            aux = aux.siguiente;
        }
    }

    // Método para imprimir todos los datos del nodo con la posición en la lista
    public void imprimirDetalles() {
        if (this.primero == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo aux = this.primero;
        int posicion = 0;
        while (aux != null) {
            System.out.println("Posición: " + posicion + ", Dato: " + aux.dato.toString());
            aux = aux.siguiente;
            posicion++;
        }
    }
}
