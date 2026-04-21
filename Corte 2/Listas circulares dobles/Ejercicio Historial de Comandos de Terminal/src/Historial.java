public class Historial {

    Comando head;
    Comando tail;

    public Historial(){
        this.head= null;
        this.tail = null;
    }

    public void agregarComando(Comando nuevo){
        if(this.head == null){
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
        System.out.println("Comando agregado correctamente al historial.");
    }

    public void arriba(Comando siguiente){
        if(siguiente != null){
            siguiente = siguiente.next;
        }
    }

    public void abajo(Comando anterior){
        if(anterior != null){
            anterior = anterior.prev;
        }
    }

    public void mostrarCursor(){
        Comando actual = head;
        if (head == null) {
            System.out.println("No hay comandos para eliminar dentro del historial");
        }
        else{
            do {
           System.out.println("\nComando actual >> " + actual); 
           actual = actual.next;
        } while (actual != head);
        }
    }

    public void eliminarActual(Comando actual){
      
        if(actual != null){
            actual.next.prev = actual.next;
            actual.prev.next = actual.prev;
        }
        if (actual == head) {
            head = actual.next;
        }
        else if (actual == tail) {
            tail = actual.prev;
        }

        System.out.println("Comando eliminado correctamente.");
    }
}
