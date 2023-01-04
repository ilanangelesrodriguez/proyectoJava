package uns.Semana08;

public class ejercicio03 {
    public static void main(String[] args) {
        //Representar una clase Ascensor(elevador) que tenga las funciones usuales
        //de subir, bajar, parar entre niveles (pisos), alarma, sobrecarga y en cada
        //nivel (piso) botones de llamada para subir o bajar.
        System.out.println("|------ Ejercicio 03 ------|");
        Ascensor ascensor=new Ascensor();
        ascensor.subir();
        ascensor.bajar();
        ascensor.alarma();
        ascensor.sobecarga();
        
        Piso piso=new Piso();
        piso.botonLlamada();
    }
}
class Piso extends Ascensor{
    int piso;
    public void botonLlamada(){
        //System.out.println("Subir");
        Piso piso=new Piso();
        piso.subir();
        piso.bajar();
    }
}
class Ascensor{
    int piso;
    public int subir(){
        return piso++;
    }
    public int bajar(){
        return piso--;
    }
    public int para(){
        return piso;
    }
    public void alarma(){
        System.out.println("alert");
    }
    public void sobecarga(){
        System.out.println("Sobrecarga");
    }
}
