package ejerciciosUNS.lab.src.uns.semana03;

import java.util.Scanner;

public class sextoEjercicio {
    public static void main(String[] args) {
        System.out.println("|---- Factorial de un Numero ----|");
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce n°: ");
        int n=sc.nextInt();
        System.out.println("Bucle While");
        int fact=n;
        fact=fact*(n-1);
        while (n!=2){
            n--;
            fact=fact*(n-1);
        }
        /*for (int i=0;i<n;i++) {
            n--;
            fact=fact*(n-1)
        }*/
        System.out.println("El factorial de "+n+" es: "+fact);
    }
}
