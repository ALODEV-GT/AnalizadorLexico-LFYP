package analizador;

public class Error {

    private String cadena;
    private int numFila;
    private int numColumna;
    private String descripcion = "Error";

    public Error(String cadena, int numFila, int numColumna) {
        this.cadena = cadena;
        this.numFila = numFila;
        this.numColumna = numColumna;
    }

    public String getCadena() {
        return cadena;
    }

    public int getNumFila() {
        return numFila;
    }

    public int getNumColumna() {
        return numColumna;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
