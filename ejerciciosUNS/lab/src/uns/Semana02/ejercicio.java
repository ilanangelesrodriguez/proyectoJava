package uns.Semana02;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        System.out.println("+------------SEMANA 02------------+");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce horas: ");
        int h=sc.nextInt();
        System.out.print("Introduce minutos: ");
        int m=sc.nextInt();
        if(m>0){
            h=h+1;
        }
        double pago=h*1.500;
        System.out.println("El pago es: S/."+pago);
        sc.close();
    }
}
