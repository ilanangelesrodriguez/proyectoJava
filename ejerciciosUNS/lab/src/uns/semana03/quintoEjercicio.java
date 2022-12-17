package ejerciciosUNS.lab.src.uns.semana03;
import java.util.Scanner;
public class quintoEjercicio {
    public static void main(String[] args) {
        System.out.println("|---- Tabla de multiplicar ----|");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce n° de multiplicación: ");
        int n=sc.nextInt();
        System.out.print("Hasta: ");
        int l=sc.nextInt();
        /*System.out.println("Bucle For");
        for (int i=0;i<=l;i++){
            int m=i*n;
            System.out.println((i+1)+") "+i+"*"+n+" = "+m);
        }*/
        System.out.println("Bucle While");
        int i=0;
        while (l!=0){
            int m=i*n;
            System.out.println((i+1)+") "+i+"*"+n+" = "+m);
            i++;
            l--;
        }
    }
}
