public class Foto {

    String titulo;
    String fecha;
    boolean esFavorita;

    Foto next;
    Foto prev;

    public Foto(){}

    public Foto(String titulo, String fecha, boolean esFavorita){
        this.titulo = titulo;
        this.fecha = fecha;
        this.esFavorita = esFavorita;
        this.next = null;
        this.prev = null;
    }
}
