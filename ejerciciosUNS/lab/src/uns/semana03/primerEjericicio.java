package ejerciciosUNS.lab.src.uns.semana03;
import java.util.Scanner;
public class primerEjericicio {
    public static void main(String[] args) {
        System.out.println("|---- Bucle While ----|");
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el numero de datos: ");
        int n=sc.nextInt();
        int suma=0;
        while (n!=0) {
            System.out.print("Elemento: ");
            int s=sc.nextInt();
            suma=suma+s;
            n--;
        }
        System.out.println("La suma de los numeros es "+suma);
    }
}
