package ejerciciosUNS.lab.src.uns.Semana05;

import java.util.Scanner;

public class ejercicio1 {
    /*
    Elaborar un algoritmo que ofrezca un menú que permita escoger la impresión de las tablas de
    multiplicar, dividir, sumar y restar, y dentro de cada opción que permita escoger las del 1, 2, 3, 4, 5,
    6, 7, 8, 9 y 10
    * */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ejercicio1 metodo=new ejercicio1();
        System.out.println("|---- Operacion matematica ----|");
        System.out.println("1) Multiplicar");
        System.out.println("2) Dividir");
        System.out.println("3) Sumar");
        System.out.println("4) Restar");
        System.out.print("Introduce tu respuesta: ");
        int opcion=sc.nextInt();
        System.out.print("Introduce el numero a operar: ");
        int n=sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("|--------- Multiplicar ---------|");
                metodo.multiplicar(n);
                break;
            case 2:
                System.out.println("|--------- Dividir ---------|");
                metodo.dividir(n);
                break;
            case 3:
                System.out.println("|--------- Sumar ---------|");
                metodo.sumar(n);
                break;
            case 4:
                System.out.println("|--------- Restar ---------|");
                metodo.restar(n);
                break;
            default:
                System.out.println("Opcion invalida!");
                break;
        }
    }
    public void multiplicar(int n){
        for (int i=0;i<10;i++){
            System.out.println(n*i);
        }
    }
    public void dividir(int n){
        for (int i=0;i<10;i++){
            System.out.println(n/i);
        }
    }
    public void sumar(int n){
        for (int i=0;i<10;i++){
            System.out.println(n+i);
        }
    }
    public void restar(int n){
        for (int i=0;i<10;i++){
            System.out.println(n-i);
        }
    }
}
