package analizador;

public enum TiposToken {
    IDENTIFICADOR("Identificador"),
    NUMERO_ENTERO("Numero entero"),
    NUMERO_DECIMAL("Numero decimal"),
    SIGNO_PUNTUACION("Signo de puntuacion"),
    OPERADOR("Operador"),
    SIGNO_AGRUPACION("Signo de agrupacion"),
    ERROR("Error");

    private String descripcion;

    private TiposToken(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
}
