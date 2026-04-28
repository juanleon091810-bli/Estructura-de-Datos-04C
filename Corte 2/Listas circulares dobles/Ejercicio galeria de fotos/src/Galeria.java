public class Galeria {

    Foto head;
    Foto tail;
    Foto actual;

    public Galeria(){
        this.head = null;
        this.tail = null;
        this.actual = null;
    }

    public void agregarFoto(String titulo, String fecha, boolean esFavorita){
        Foto newFoto = new Foto(titulo, fecha, esFavorita);

        if(head == null){
            head = newFoto;
            tail = newFoto;
            newFoto.next = tail;
            newFoto.prev = head;
        }
        else{
            tail.next = newFoto;
            newFoto.prev = tail;
            newFoto.next = head;
            head.prev = newFoto;
            tail = newFoto;
        }
    }

    public void siguiente(Foto actual){

        if(actual == null){
            System.out.println("No hay fotos en la galería.");
            return;
        }
        else{
            this.actual= actual.next;
        }
    }

    public void anterior(Foto actual){

        if(actual == null){
            System.out.println("No hay fotos en la galería.");
            return;
        }
        else{
            this.actual= actual.prev;
        }
    }

    public void toggleFavorita(Foto actual){
        if(actual == null){
            System.out.println("No hay fotos en la galería.");
            return;
        }
        else{
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual(Foto actual){
        if(actual == null){
            System.out.println("No hay fotos en la galería.");
            return;
        }
        else{
            if(actual == head && actual == tail){
                head = null;
                tail = null;
                this.actual = null;
                System.out.println("La galería está vacía.");
            }
            else if(actual == head){
                head = head.next;
                head.prev = tail;
                tail.next = head;
                this.actual = head;
            }
            else if(actual == tail){
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                this.actual = head;
            }
            else{
                actual.prev.next = actual.next;
                actual.next.prev = actual.prev;
                this.actual = actual.next;
            }
        }
        System.out.println("Foto eliminada. Mostrando la siguiente foto.");
    }

    public void mostrarGaleria(Galeria newGaleria){
        if(newGaleria.head == null){
            System.out.println("No hay fotos en la galería.");
            return;
        }
        else{
            Foto current = newGaleria.head;
            do{
                String favorita = current.esFavorita ? "[★]" : "";
                String actual = (current == this.actual) ? "[▶]" : "";
                System.out.println(actual + favorita + " " + current.titulo + " - " + current.fecha);
                current = current.next;
            } while(current != newGaleria.head);
        }
    }
}
