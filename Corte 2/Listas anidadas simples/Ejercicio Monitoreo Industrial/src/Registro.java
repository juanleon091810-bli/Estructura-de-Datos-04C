public class Registro {

    Lectura cabeza;

    public Registro(){
        this.cabeza = null;
    }

    public void agregarLectura(Lectura newLectura){
        if(cabeza == null){
            cabeza = newLectura;
        }else{
            newLectura.next = cabeza;
            cabeza = newLectura;
        }
    }

    public void showHighLectura(){
        if (cabeza == null) {
            System.out.println("NO SE ENCUENTRAN LECTURAS EN EL REGISTRO");
        }
        else{
            Lectura temp = cabeza;
            Lectura highTemp = cabeza;
            while (cabeza.next != null) {
                if (temp.temperatura > highTemp.temperatura) {
                    highTemp = temp;
                }
                temp = temp.next;
            }
            System.out.println("LECTURA DE TEMPERATURA MÁS ALTA:");
            System.out.println("Temperatura: " + highTemp.temperatura);
            System.out.println("Hora: " + highTemp.hora);
        }
    }
}
