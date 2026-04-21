public class Comando {

    String texto;
    boolean exitoso;
    String directorio;

    Comando next;
    Comando prev;

    public Comando(){}

    public Comando(String texto, boolean exitoso, String directorio){
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
        this.next = null;
        this.prev = null;
    }
}
