import java.util.Objects;

public interface IAcciones {
    void agregar(Objects obj) throws Exceptions;
    Objects buscar(Objects obj);
    void quitar (Object obj) throws Exceptions;

}
