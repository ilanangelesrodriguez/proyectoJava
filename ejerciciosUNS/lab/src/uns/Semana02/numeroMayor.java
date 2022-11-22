package uns.Semana02;
import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        System.out.println("+------------SEMANA 02------------+");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el n° de datos: ");
        int x=sc.nextInt();

        System.out.print("Valor "+1+": ");
        int n=sc.nextInt();
        int mayor=n;
        int menor=n;

        for(int i=0;i<x-1;i++){
            System.out.print("Valor "+(i+2)+": ");
            n=sc.nextInt();

            if(n>=mayor){
                mayor=n;
            } 
            if(n<=menor){
                menor=n;
            }
        }
        System.out.println("El valor mayor es: "+mayor);
        System.out.println("El valor menor es: "+menor);
        sc.close();
    }
}
