package uns.Semana02;
import java.util.Scanner;
public class multiplo10 {
    public static void main(String[] args) {
        System.out.println("+------------SEMANA 02------------+");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        int x=sc.nextInt();
        if(x%10==0){
            System.out.println("Es multiplo de 10");
        } else{
            System.out.println("No es multiplo de 10");
        }
        sc.close();
    }
}
