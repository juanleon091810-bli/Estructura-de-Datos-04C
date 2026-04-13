public class Navegador {

    Pestana inicio;
    Pestana fin;

    public Navegador(){
       
        this.inicio = null;
        this.fin = null;
    }

    public void nuevaPestana(Pestana pestana){
        if(inicio == null){
            inicio = pestana;
            fin = pestana;
        }
        else{
            fin.next = pestana;
            pestana.prev = fin;
            fin = pestana;
        }
    }

    public void cerrarPestanaActual(String url){
        Pestana actual = inicio;

        while(actual != null){
            if(actual.url.equals(url)){
                if(actual.prev != null){
                    actual.prev.next = actual.next;
                }
                else{
                    inicio = actual.next;
                }

                if(actual.next != null){
                    actual.next.prev = actual.prev;
                }
                else{
                    fin = actual.prev;
                }
                break;
            }
            actual = actual.next;
        }
    }
}
