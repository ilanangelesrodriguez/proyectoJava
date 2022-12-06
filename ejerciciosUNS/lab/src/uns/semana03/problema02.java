package uns.semana03;
/*
 * author: Ilan Nestor Angeles Rodriguez
 */
import java.util.Scanner;
public class problema02 {
    public static void main(String[] args) {
        System.out.println("Lista de material requerido");
        Scanner sc=new Scanner(System.in);
        System.out.print("N° de materiales: ");
        int n=sc.nextInt();
        int a=0;
        while (n!=a) {
            a++;
            System.out.println("Material "+ a);
        }
        sc.close();
    }
}
