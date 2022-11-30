package uns.Semana02;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("+------------SEMANA 02------------+");
        Scanner sc=new Scanner(System.in);
        double montopag, montocom, montodes, precio;
        int docenas, obsequios;
        System.out.print("Introduce docenas: ");
        docenas =sc.nextInt();
        System.out.print("Introduce precio: ");
        precio=sc.nextDouble();

        montocom=docenas*precio;
        if(docenas>3){
            montodes=0.15*montocom;
            obsequios=docenas-3;
        } else {
            montodes=0.10*montocom;
            obsequios=0;
        }
        montopag=montocom-montodes;
        System.out.println("<--- Montos --->");
        System.out.println(montocom);
        System.out.println(montodes);
        System.out.println(montopag);
        System.out.println(obsequios);
        sc.close();
    }
}
