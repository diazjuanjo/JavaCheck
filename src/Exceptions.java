public class Exceptions extends Exception {

    private String mensaje;

    public Exceptions(String mensaje) {
        super(String.format(mensaje));
        this.mensaje = mensaje;
    }
}
