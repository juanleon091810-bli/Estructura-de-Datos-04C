public class Planificador {

    Proceso head;
    Proceso tail;

    public Planificador(){

        this.head = null;
        this.tail = null;
    }

    public void agregarQuantum(Proceso nuevo){
        if (head.next == null) {
            head = nuevo;
            tail = nuevo;
            nuevo.next = nuevo;
            nuevo.prev = nuevo;
        }
        else{
            nuevo.prev = tail;
            nuevo.next = head;
            tail.next = nuevo;
            head.prev = nuevo;
            tail = nuevo;
        }
    }

    
}
