package Init.laboratorio;
import java.util.Scanner;
/*  Escriba un programa que reciba cuatro calificaciones vigesimales (0-20) de un estudiante y devuelva el  promedio, la máxima y la mínima calificación.
*/

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma;
        System.out.print("Introduce el n° de calificaciones: ");
        int n=sc.nextInt();
        System.out.print("Introduce calificacion "+(1)+": ");
        int a=sc.nextInt();
        int nmayor=a;
        int nmenor=a;
        suma=a;
        for(int i=0;i<n-1;i++){
            System.out.print("Introduce calificacion "+(i+2)+": ");
            a=sc.nextInt();
            suma=suma+a;
            //La nota maxima
            if(a>=nmayor){
                nmayor=a;
            }
            if(a<=nmenor){
                nmenor=a;
            }
        }
        sc.close();
        int promedio=(suma)/n;
        System.out.println("Promedio: "+promedio);
        System.out.println("Nota maxima: "+nmayor);
        System.out.println("Nota minima: "+nmenor);
    }
}
