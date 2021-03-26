import java.util.List;
import java.util.Objects;

public class Usuario extends Persona{
    private List<Serie> series;

    public Usuario() {
    }

    public Usuario(List<Serie> series) {
        this.series = series;
    }

    public Usuario(Integer dni, String nombres, List<Serie> series) {
        super(dni, nombres);
        this.series = series;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public void agregarSerie(Serie serie) throws Exceptions{
        series.add(serie);
    }

    public void verCapitulo(Serie serie) throws Exceptions{

    }

    public Integer cantidadCapitulosVistos(){
        return 1;
    }

    public void listarContinuarViendo() throws Exceptions{

    }

    @Override
    public String toString() {
        return "Usuario{" +
                super.toString()+
                "series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        if (!super.equals(o)) return false;
        Usuario usuario = (Usuario) o;
        return getSeries().equals(usuario.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSeries());
    }


}
