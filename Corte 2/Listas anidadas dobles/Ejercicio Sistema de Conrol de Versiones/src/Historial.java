public class Historial {

    Cambio inicio;
    Cambio fin;

    public Historial(){
        
        this.inicio = null;
        this.fin = null;
    }

    public void agregarCambio(Cambio newCambio){

        if (inicio == null) {
            inicio = newCambio;
            fin = newCambio;
        }
        else{
            fin.next = newCambio;
            newCambio.prev = fin;
            fin = newCambio;
        }
    }

    public Cambio deshacer(Cambio cambioActual){
        if(cambioActual.prev == null){
            System.out.println("NO EXISTEN CAMBIOS PARA REALIZAR");
            return cambioActual;
        }
        return cambioActual.prev;
    }

    public Cambio rehacer(Cambio cambioActual){
        if (cambioActual.next == null) {
            System.out.println("NO HAY CAMBIOS PARA REALIZAR");
            return cambioActual;
        }
        return cambioActual.next;
    }
}
