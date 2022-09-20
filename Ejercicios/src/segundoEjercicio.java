/*Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/
public class segundoEjercicio {
    public static void main(String[] args) {
        int nPuertas=4;
        System.out.println("Coche");
        //System.out.print("El numero de puertas ahora es:"+puertas(nPuertas));
        int apuertas=puertas(nPuertas);
        //segundoEjercicio miCoche = new segundoEjercicio();
        //miCoche.coche();
        System.out.print("El numero de puertas ahora es: "+coche(apuertas));
    }
    public static int puertas(int nPuertas){
        return nPuertas+1;
    }
    public static int coche(int apuertas){
        return apuertas+1;
    }
}
