import java.util.Objects;

public abstract class Persona {
    private Integer dni;
    private String nombres;

    public Persona() {
    }

    public Persona(Integer dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "dni=" + dni +
                ", nombres='" + nombres + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getDni().equals(persona.getDni()) && getNombres().equals(persona.getNombres());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni(), getNombres());
    }
}
