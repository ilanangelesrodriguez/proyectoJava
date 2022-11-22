package uns.Semana02;
import java.util.Scanner;
public class Par_Impar {
    public static void main(String[] args) {
        System.out.println("+------------SEMANA 02------------+");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        int x=sc.nextInt();
        if((x%2==0)){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        sc.close();
    }
}
