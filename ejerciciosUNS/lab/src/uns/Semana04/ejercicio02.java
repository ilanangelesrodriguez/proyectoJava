package uns.Semana04;
import java.util.Scanner;
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Crea un arreglo de una longitud e ingresar numero
        System.out.println("|---- Arreglos ----|");
        System.out.print("Introduce longitud: ");
        int n=sc.nextInt();
        int [] number=new int [n];
        for (int i=0;i<n;i++){
            System.out.print("Valor de number["+i+"]= ");
            number[i]=sc.nextInt();
        }
        System.out.println("|---- Valores del arreglo ----|");
        for (int j=0;j<n;j++){
            System.out.println("number["+j+"]= "+number[j]);
        }
    }
}
