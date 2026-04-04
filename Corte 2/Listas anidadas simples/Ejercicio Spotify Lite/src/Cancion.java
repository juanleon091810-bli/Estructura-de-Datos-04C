public class Cancion {

    String titulo;
    String artista;
    int duracionS;
    String genero;

    Cancion next;

    public Cancion(){}

    public Cancion(String titulo, String artista, int duracionS, String genero){
        this.titulo = titulo;
        this.duracionS = duracionS;
        this.genero = genero;
        this.next = null;
    }
}
