package Init.laboratorio;
import java.util.Scanner;
/**Diseña un programa donde se ingrese tres números enteros y muestre la suma, resta y multiplicación del mayor con el menor número. */

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Ingresa n° "+(1)+": ");
        n=sc.nextInt();
        int mayor=n;
        int menor=n;
        
        for(int i=0;i<=1;i++){
            System.out.print("Ingresa n° "+(i+2)+": ");
            n=sc.nextInt();

            if(n>=mayor){
                mayor=n;
            }
            for(int j=0;j<=2;j++){
                if(n<=menor){
                    menor=n;
                }
            }
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        sc.close();
    }
}
