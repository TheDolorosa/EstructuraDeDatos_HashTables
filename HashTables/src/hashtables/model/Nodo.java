package hashtables.model;

/**
 * Nodo utilizado en las listas encadenadas de la tabla hash.
 * Cada nodo almacena un registro y un enlace al siguiente.
 */
public class Nodo {
    private Registro data;
    private Nodo siguiente;

    public Nodo(Registro data) {
        this.data = data;
        this.siguiente = null;
    }

    public Registro getData() { return data; }
    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
