public class Lectura {

    int idSensor;
    Double temperatura;
    double presion;
    String hora;

    Lectura next;

    public Lectura(){}

    public Lectura(int idSensor, Double temperatura, double presion, String hora) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
        this.presion = presion;
        this.hora = hora;
        this.next = null;
    }

}
