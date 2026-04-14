public class Carrusel {

    Anuncio cabeza;
    Anuncio cola;
    int totalTiempo;

    public Carrusel(){
        this.cabeza = null;
        this.cola = null;
        this.totalTiempo = 0;
    }

    public void agregarAnuncio(Anuncio nuevo){
        if(cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            nuevo.next = nuevo;
            nuevo.prev = nuevo;
        } else {
            nuevo.prev = cola;
            nuevo.next = cabeza;
            cola.next = nuevo;
            cabeza.prev = nuevo;
            cola = nuevo;
        }
    }

    public void reproducir(int ciclos){
        if(cabeza == null) return;

        Anuncio actual = cabeza;
        for(int i = 0; i < ciclos; i++){
            System.out.println("Anuncio en pantalla: " + actual.titulo);
            totalTiempo += actual.duracionSegundos;
            actual.vecesRepetido++;
            actual = actual.next;
        }

        Anuncio masRepetido = cabeza;
        Anuncio temp = cabeza.next;
        while(temp != cabeza){
            if(temp.vecesRepetido > masRepetido.vecesRepetido){
                masRepetido = temp;
            }
            temp = temp.next;
        }

        System.out.println("Anuncio más repetido: " + masRepetido.titulo + " con " + masRepetido.vecesRepetido + " repeticiones.");
        System.out.println("Tiempo total acumulado en pantalla: " + totalTiempo + " segundos.");
    }
}
