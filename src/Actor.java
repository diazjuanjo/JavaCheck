import java.util.Objects;

public class Actor extends Persona{
    private String apellido;

    public Actor() {
    }

    public Actor(String apellido) {
        this.apellido = apellido;
    }

    public Actor(Integer dni, String nombres, String apellido) {
        super(dni, nombres);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Actor{" +
                super.toString() +
                "apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return getApellido().equals(actor.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getApellido());
    }
}
