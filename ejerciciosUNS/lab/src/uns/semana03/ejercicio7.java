package ejerciciosUNS.lab.src.uns.semana03;

import java.util.Scanner;

public class ejercicio7 {
    //Escribir un programa 10n, muestre mult 3 y 5
    public static void main(String[] args) {
        System.out.println("|---- Ejercicio de multiplo de 3 y 5 ----|");
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            int n = sc.nextInt();
            if (n % 3 == 0) {
                System.out.println("El multiplo de 3");
            } else {
                System.out.println("No es multiplo de 3");
            }
            if (n % 5 == 0) {
                System.out.println("El multiplo de 5");
            } else {
                System.out.println("No es multiplo de 5");
            }
        }
    }
}
