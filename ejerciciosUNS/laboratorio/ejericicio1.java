package Init.laboratorio;
import java.util.Scanner;
/*
 * Hacer un programa que pida el ingreso de las horas, minutos y segundos de un momento dado y que el programa exprese dichos datos en segundos.
 */
public class ejericicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        int h=sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m=sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int s=sc.nextInt();
        sc.close();
        int c = h*3600+m*60+s;
        System.out.println("Dato: "+c+" segundos.");

        
    }
}
