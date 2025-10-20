package hashtables.model;

import java.util.LinkedList;

/**
 * Clase que implementa la tabla hash.
 * Usa encadenamiento para resolver colisiones.
 * Tendrá soporte para dos funciones hash:
 * - Método de división
 * - Método de multiplicación
 */
public class HashTable {
    private final int m = 256; // Tamaño de la tabla
    private LinkedList<Registro>[] tabla; // Arreglo de listas (slots)

    // Constructor
    @SuppressWarnings("unchecked")
    public HashTable() {
        tabla = new LinkedList[m];
        for (int i = 0; i < m; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    /**
     * Calcula la clave numérica k a partir del id (reducción ASCII).
     * @param id cadena del tipo "05-9165610"
     * @return entero k
     */
    public int calcularClave(String id) {
        // TODO: implementar la reducción ASCII
        return 0;
    }

    /**
     * Función hash - Método de multiplicación.
     */
    public int hashMultiplicacion(int k) {
        // TODO: implementar la fórmula con A = (√5 - 1)/2
        return 0;
    }

    /**
     * Función hash - Método de división.
     */
    public int hashDivision(int k) {
        // TODO: implementar k mod m
        return 0;
    }

    // TODO: agregar métodos insertar, eliminar, buscar, contarColisiones...
}
