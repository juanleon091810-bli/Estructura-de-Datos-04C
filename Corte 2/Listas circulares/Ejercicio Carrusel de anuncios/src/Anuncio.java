public class Anuncio {

    String titulo;
    int duracionSegundos;
    int vecesRepetido;
    String categoria;

    Anuncio next;
    Anuncio prev;

    public Anuncio(){}

    public Anuncio(String titulo, int duracionSegundos, int vecesRepetido, String categoria){
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.vecesRepetido = vecesRepetido;
        this.categoria = categoria;
        this.next = null;
        this.prev = null;
    }
}
