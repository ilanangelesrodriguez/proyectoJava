package Init.laboratorio;
import java.util.Scanner;
/*Una ferretería ofrece un descuento del 12% si el monto de compra es de 250 soles a más. Diseñar un programa que muestre si el cliente tiene descuento, el descuento en soles y el monto final a pagar. */

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el monto a pagar: S/.");
        double monto=sc.nextDouble();
        System.out.print("Descuento obtenido: %");
        double desc=sc.nextDouble();
        sc.close();

        if(monto>250){
            double descuento=(desc*monto)/100;
            monto=monto-descuento;
            System.out.println("Descuento: S/."+descuento);
            System.out.println("Monto final: S/."+monto);

        } else {
            System.out.println("Monto final: S/."+monto);
            
        }
    }
}
