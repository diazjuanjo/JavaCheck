import java.util.List;
import java.util.Objects;

public class Temporada {
    private static int idTemporada = 0;
    private Integer id;
    private Integer numero;
    private Integer anio;
    private Boolean iniciada;
    private Boolean terminada;
    private List<Capitulo> capitulos;

    public Temporada() {
    }

    public Temporada(Integer numero, Integer anio, Boolean iniciada, Boolean terminada, List<Capitulo> capitulos) {
        this.id = idTemporada++;
        this.numero = numero;
        this.anio = anio;
        this.iniciada = iniciada;
        this.terminada = terminada;
        this.capitulos = capitulos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Boolean getIniciada() {
        return iniciada;
    }

    public void setIniciada(Boolean iniciada) {
        this.iniciada = iniciada;
    }

    public Boolean getTerminada() {
        return terminada;
    }

    public void setTerminada(Boolean terminada) {
        this.terminada = terminada;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public void agregarCapitulo(Capitulo capitulo){
//
//        if (capitulos.contains(capitulo)){
//            throw new Exceptions("Capitulo repetido");
//        }
//        capitulos.add((Capitulo) capitulo);

    }

    public int capitulosVistos(){
//        return capitulos.forEach((capitulo -> (capitulo.toString())));
return 1;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", numero=" + numero +
                ", anio=" + anio +
                ", iniciada=" + iniciada +
                ", terminada=" + terminada +
                ", capitulos=" + capitulos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temporada)) return false;
        Temporada temporada = (Temporada) o;
        return Objects.equals(id, temporada.id) && getNumero().equals(temporada.getNumero()) && getAnio().equals(temporada.getAnio()) && getIniciada().equals(temporada.getIniciada()) && getTerminada().equals(temporada.getTerminada()) && getCapitulos().equals(temporada.getCapitulos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getNumero(), getAnio(), getIniciada(), getTerminada(), getCapitulos());
    }
}
