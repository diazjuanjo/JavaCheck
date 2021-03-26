import java.util.Objects;

public class Personaje {
    private static int idPersonaje = 1000;
    private Integer id;
    private Actor actor;
    private String nombrePersonaje;

    public Personaje() {
    }

    public Personaje(Actor actor, String nombrePersonaje) {
        this.id = idPersonaje++;
        this.actor = actor;
        this.nombrePersonaje = nombrePersonaje;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", actor=" + actor +
                ", nombrePersonaje='" + nombrePersonaje + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return id.equals(personaje.id) && getActor().equals(personaje.getActor()) && getNombrePersonaje().equals(personaje.getNombrePersonaje());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getActor(), getNombrePersonaje());
    }
}
