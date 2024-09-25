package principal;

class Persona {
    String ci, nombre;
    Persona siguiente; //innatura

    public Persona(String ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
        this.siguiente = null;
    }

    public Persona(String ci, String nombre, Persona siguiente) {
        this.ci = ci;
        this.nombre = nombre;
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return "Cedula: " + this.ci + "   Nombre: " + this.nombre;
    }
    
}// FINAL CLASS
