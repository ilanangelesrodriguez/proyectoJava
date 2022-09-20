/*Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---Calculadora---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer valor: ");
        int a=sc.nextInt();
        System.out.print("Introduce el segundo valor: ");
        int b=sc.nextInt();
        System.out.print("Introduce el tercer valor: ");
        int c=sc.nextInt();
        System.out.print("La suma de los valores es "+suma(a,b,c));
        //suma(a,b,c);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}