package Init.laboratorio;
import java.util.Scanner;
/*Diseña un programa que permita calcular la longitud de uno de los catetos de un triángulo rectángulo, si se ingresa la hipotenusa y uno de los catetos. */

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la hipotenusa: ");
        double h=sc.nextDouble();
        double a=Math.pow(h,2);
        System.out.print("Introduce el cateto adyacente: ");
        double ca=sc.nextDouble();
        double b=Math.pow(ca,2);
        sc.close();
        // double c=Math.pow(cb,2);
        double cb=Math.sqrt(a-b);
        System.out.println("El cateto opuesto es: "+cb);

    }
}
