package Init.laboratorio;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*Diseña un programa que permita mostrar la raíz cuadrada, cúbica y cuarta de un número entero positivo.*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int h=sc.nextInt();
        //Raiz cuadrada
        double r2=Math.sqrt(h);
        //Raiz cubica
        double r3=Math.cbrt(h);
        //Raiz cuarta
        double r4=Math.sqrt(r2);
        sc.close();
        System.out.println("Raiz cuadrada: "+r2);
        System.out.println("Raiz cubica: "+r3);
        System.out.println("Raiz cuarta: "+r4);
    }
}
