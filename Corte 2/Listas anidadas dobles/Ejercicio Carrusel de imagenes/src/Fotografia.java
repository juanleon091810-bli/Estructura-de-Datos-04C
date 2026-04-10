public class Fotografia {

    String nombreArchivo;
    double tamañoMB;
    String resolucion;

    Fotografia next;
    Fotografia prev;

    public Fotografia(){}

    public Fotografia(String nombreArchivo, double tamañoMB, String resolucion){
        this.nombreArchivo = nombreArchivo;
        this.tamañoMB = tamañoMB;
        this.resolucion = resolucion;
        this.next = null;
        this.prev = null;
    }
}
