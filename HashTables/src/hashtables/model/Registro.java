package hashtables.model;

/**
 * Representa un registro del archivo CSV.
 * Cada registro tiene un id (clave), nombre, apellido y género.
 */
public class Registro {
    private String id;
    private String firstName;
    private String lastName;
    private String gender;

    // Constructor
    public Registro(String id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getters y setters
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName + " (" + gender + ")";
    }
}
