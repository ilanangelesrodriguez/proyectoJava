package uns.Semana08;

public class ejercicio02 {
    public static void main(String[] args) {
        //Construir una clase llamada Luz de tráfico. El atributo color de la clase
        //debe cambiar de Verde a Amarillo y a Rojo y de nuevo regresar a Verde
        //mediante la función cambio. Cuando un objeto Luz se crea su color inicial
        //será Rojo.
        int i=1;
        System.out.println("|------ Ejercicio 02 ------|");
        //System.out.print("Luz de semáforo: ");
        luzDeTrafico semaforo=new luzDeTrafico();

        System.out.print("Luz de semáforo: ");
        semaforo.cambioColor(semaforo.color);
        do {
            System.out.print("Luz de semáforo: ");
            semaforo.cambioColor(semaforo.color);
            i++;
        } while(i<5);
    }
}
class luzDeTrafico{
    String color="rojo";
    public void cambioColor(String ccolor) {
        //System.out.println(color);
        if (ccolor == "verde") {
            System.out.println(ccolor);
            color = "amarillo";
            System.out.println(color);
        } else if (ccolor == "amarillo") {
            System.out.println(ccolor);
            color = "rojo";
            System.out.println(color);
        } else if (ccolor == "rojo") {
            System.out.println(ccolor);
            color = "verde";
            System.out.println(color);
        }
    }
}
