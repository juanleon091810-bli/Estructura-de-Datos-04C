public class Playlist {

    Cancion added;

    public Playlist(){
        this.added = null;
    }

    public void agregarCancion(Cancion newCancion){
        if (added == null) {
            added = newCancion;
        }
        else{
            newCancion.next = added;
            added = newCancion;
        }
    }

    public void mostrarPlaylist(){
        Cancion current = added;
        while (current.next != null) {
            System.out.println("Titulo: " + current.titulo +
                "\nArtista: " + current.artista +
                "\nDuracion: " + current.duracionS + "segundos\n" + 
                "Genero: " + current.genero + "\n"
            );
        }
    }

    public String duracionTotal(){
        int  totalS = 0;
        Cancion current = added;
        while (current.next != null) {
            totalS += current.duracionS;
        }
        int totalM = totalS / 60;
        totalS %= 60;
        return totalM + " minutos y " + totalS + " segundos";

    }
}
