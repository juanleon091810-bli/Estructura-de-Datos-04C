public class Pestana {

    String tituloPagina;
    String url;
    String horaApertura;

    Pestana next;
    Pestana prev;

    public Pestana(){}

    public Pestana(String tituloPagina, String url, String horaApertura){
        this.tituloPagina = tituloPagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.next = null;
        this.prev = null;
    }
}
