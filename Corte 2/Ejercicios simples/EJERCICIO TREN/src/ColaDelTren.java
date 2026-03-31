public class ColaDelTren {

    Vagon cabeza;

    public ColaDelTren() {
        this.cabeza = null;
    }

    public void añadirVagon(Vagon newVagon){
        if(cabeza ==null){
            cabeza = newVagon;
        }
        else{
            Vagon actual = cabeza;
            while(actual.next != null){
                actual = actual.next;
            }
            actual.next = newVagon;
        }
    }

    public double pesoTotal(){
        double pesoTotal = 0;
        Vagon actual = cabeza;
        while(actual != null){
            pesoTotal += actual.pesoToneladas;
            actual = actual.next;
        }
        return pesoTotal;
    }
}
