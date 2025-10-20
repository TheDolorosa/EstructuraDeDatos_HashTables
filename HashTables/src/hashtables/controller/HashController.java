package hashtables.controller;

import hashtables.model.HashTable;
import hashtables.model.Registro;
import java.io.File;

/**
 * Controlador entre la interfaz gráfica y la lógica del programa.
 * Se encarga de conectar los botones del GUI con la tabla hash.
 */
public class HashController {
    private HashTable hashTable;

    public HashController() {
        this.hashTable = new HashTable();
    }

    /**
     * Carga datos desde un archivo CSV.
     * @param archivo ruta del archivo CSV
     */
    public void cargarArchivo(File archivo) {
        // TODO: leer MOCK_DATA.csv y llenar la tabla
    }

    /**
     * Inserta un nuevo registro.
     */
    public void insertarRegistro(Registro r) {
        // TODO: implementar
    }

    /**
     * Busca un registro por id.
     */
    public Registro buscarPorId(String id) {
        // TODO: implementar
        return null;
    }

    /**
     * Elimina un registro por id.
     */
    public void eliminarPorId(String id) {
        // TODO: implementar
    }
}
