package ejerciciosUNS.lab.src.uns.semana03;
import java.util.Scanner;
public class segundoEjercicio {
    public static void main(String[] args) {
        System.out.println("|---- Bucle Do While ----|");
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el numero de datos: ");
        int n= sc.nextInt();
        int suma=0;
        int count=0;
        do {
            count ++;
            n--;
            System.out.print("Elemento "+count+": ");
            int e=sc.nextInt();
            suma=suma+e;
        } while (n!=0);
        System.out.println("La suma de los numeros es "+suma);
    }
}
