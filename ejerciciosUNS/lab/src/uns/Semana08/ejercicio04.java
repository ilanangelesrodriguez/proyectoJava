package uns.Semana08;

public class ejercicio04 {
    public static void main(String[] args) {
        //Construir una clase que describa un rectangulo que se pueda visualizar en la pantalla de la
        //computadora, cambiar de tamaño, modificar su color de fondo, los colores de sus lados
        System.out.println("|------ Ejercicio 04 ------|");
        rectangulo rect=new rectangulo();
        System.out.println("Cambiar tamaño");
        System.out.print("Aumentar: ");
        rect.aumentarLado();
        System.out.print("Reducir");
        rect.reducirLado();
    }
}
class rectangulo {
    int lado;
    String color;
    public int reducirLado(){
        return lado--;
    }
    public int aumentarLado(){
        return lado++;
    }
    public void colorFondo(String color){
        this.color=color;
    }
    public void colorLado(String color){
        this.color=color;
    }
}
