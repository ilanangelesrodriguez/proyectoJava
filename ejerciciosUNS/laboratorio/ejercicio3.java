package Init.laboratorio;
import java.util.Scanner;
/*Realizar un programa que lea el valor de un ángulo en radianes y muestre su valor en grados, minutos y segundos. */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el angulo (en radianes): ");
        double ar=sc.nextDouble();
        sc.close();
        double angGrados = Math.toDegrees(ar);
        //System.out.println("Grados: "+Math.round(angGrados));
        
        double mr=angGrados%1;
        double m=mr*60;
        //System.out.println("minutos: "+ Math.round(m));

        double ms=m%1;
        float s=(float) ms*60;
        //System.out.println("segundos: "+s);

        System.out.println("Notacion: "+Math.round(angGrados)+"° "+Math.round(m)+"' "+s+"''");
    }
}
