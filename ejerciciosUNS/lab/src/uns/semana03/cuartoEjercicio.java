package ejerciciosUNS.lab.src.uns.semana03;
import java.util.Scanner;
public class cuartoEjercicio {
    public static void main(String[] args) {
        System.out.println("|---- Caracteres ASCII ----|");
        Scanner sc=new Scanner(System.in);
        //String l=sc.nextLine();
        System.out.println("Letras Minusculas");
        for (char c='a';c<='z';c++){
            System.out.println("Caracter "+(int)c+" es: "+c);
        }
        System.out.println("Letras Mayusculas");
        for (char c='A';c<='Z';c++){
            System.out.println("Caracter "+(int)c+" es: "+c);
        }
    }
}
