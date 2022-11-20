package Init.laboratorio;
import java.util.Scanner;
/*Una boutique ofrece la siguiente promoción: tres polos por el precio de los dos mas baratos. Diseña el programa que, dados los tres precios de los polos, determine la cantidad final a pagar. */

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("<-------------- Ilan SAC -------------->");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el precio del polo "+1+": S/.");
        double p=sc.nextDouble();
        // double mayor=p;
        double menor=p;
        for(int i=0;i<2;i++){
            System.out.print("Introduce el precio del polo "+(i+2)+": S/.");
            p=sc.nextDouble();
            if(p<=menor){
                menor=p;
            }
        }
        System.out.println("El precio menor es S/."+menor);
        System.out.println("La cantidad final a pagar es S/."+3*menor);
        sc.close();
    }
}
