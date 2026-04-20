public class Proceso {

    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;

    Proceso next;
    Proceso prev;

    public Proceso(){}

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad){
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.next = null;
        this.prev = null;
    }
}
