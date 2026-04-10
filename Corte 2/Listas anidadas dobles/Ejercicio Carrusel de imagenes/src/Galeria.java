public class Galeria {

    Fotografia nueva;
    Fotografia anterior;

    public Galeria(){
        this.nueva = null;
        this.anterior = null;
    }

    public void agergarFoto(Fotografia foto){
        if (nueva == null) {
            nueva = foto;
            anterior = foto;
        }
        else{
            anterior.next = foto;
            foto.prev = anterior;
            anterior = foto;
        }
    }

    public void adelantarFotos(){
        Fotografia actual = nueva;
        if(actual == null || actual.next == null){
            System.out.println("No hay fotos pra adelantar.");
        }
        else{
            
        }
    }

    public void reproducirGaleria(){
        Fotografia actual = nueva;

        System.out.println("Reproduciendo la galeria hacia adelante:\n");
        do {
            System.out.println("Nombre del archivo: " + actual.nombreArchivo);
            System.out.println("Tamaño en MB: " + actual.tamañoMB);
            System.out.println("Resolucion: " + actual.resolucion);
            actual = actual.next;
        }while (actual != null);

        System.out.println("Reproduciendo la galeria desde atras:\n");
        do {
            System.out.println("Nombre del archivo: " + actual.nombreArchivo);
            System.out.println("Tamanño delarchivo: " + actual.tamañoMB);
            System.out.println("Resolucion: " + actual.resolucion);
            actual = actual.prev;
        } while (actual != null);
    }
}
