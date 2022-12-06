package ejerciciosUNS.lab.src.uns.semana03;
import java.util.Scanner;
public class tercerEjercicio {
    public static void main(String[] args) {
        System.out.println("|---- Estructura for -----|");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el numero de elementos: ");
        int n= sc.nextInt();
        int suma=0;
        int p=0;
        for (int i=0;i<n;i++){
            p=(i+1)*2;
            System.out.println("Elemento "+(i+1)+": "+p);
            //System.out.print("Elemento "+(i+1)+": ");
            //int e= sc.nextInt();
            suma=suma+p;
        }
        System.out.println("La suma de los números es "+suma);
    }
}
