import java.util.List;
import java.util.Objects;

public class Serie implements  IAcciones{
    private Integer id;
    private String titulo;
    private String genero;
    private Integer anio;
    private String sinopsis;
    private List<Temporada> temporadas;
    private List<Personaje> personajes;

    public Serie() {
    }

    public Serie(Integer id, String titulo, String genero, Integer anio, String sinopsis, List<Personaje> personajes) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.personajes = personajes;
    }

    public Serie(Integer id, String titulo, String genero, Integer anio, String sinopsis, List<Personaje> personajes, List<Temporada> temporadas) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.temporadas = temporadas;
        this.personajes = personajes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", sinopsis='" + sinopsis + '\'' +
                ", temporadas=" + temporadas +
                ", personajes=" + personajes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return getId().equals(serie.getId()) && getTitulo().equals(serie.getTitulo()) && getGenero().equals(serie.getGenero()) && getAnio().equals(serie.getAnio()) && getSinopsis().equals(serie.getSinopsis()) && getTemporadas().equals(serie.getTemporadas()) && getPersonajes().equals(serie.getPersonajes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getGenero(), getAnio(), getSinopsis(), getTemporadas(), getPersonajes());
    }

    @Override
    public void agregar(Objects obj) throws Exceptions {

    }

    @Override
    public void buscar(Objects obj) {

    }

    @Override
    public void quitar(Object obj) throws Exceptions {

    }
}
