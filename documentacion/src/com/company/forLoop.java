package com.company;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        System.out.println("Numeros");
        System.out.print("Introduce un numero: ");
        Scanner sc= new Scanner(System.in);
        int n=Integer.valueOf(sc.nextInt());
        for (int i=1; i<=n;i++){
            //i=i+1;
            System.out.println(i);
        }
    }
}
