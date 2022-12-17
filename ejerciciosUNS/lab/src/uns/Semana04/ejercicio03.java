package ejerciciosUNS.lab.src.uns.Semana04;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("|---- Arreglos ----|");
        ejercicio03 arreglo=new ejercicio03();
        System.out.print("Introduce longitud: ");
        int n=sc.nextInt();
        arreglo.arreglo(n);
    }
    public void arreglo(int n){
        Scanner sc=new Scanner(System.in);
        int [] number=new int [n];
        System.out.print("Valor de number["+0+"]= ");
        number[0]=sc.nextInt();
        int max=number[0];
        int min=number[0];
        int posA=0;
        int posB=0;
        for (int i=1;i<n;i++){
            System.out.print("Valor de number["+i+"]= ");
            number[i]=sc.nextInt();
            if (number[i] >= max){
                max=number[i];
                posA=i;
            }
            if (number[i] <= min){
                min=number[i];
                posB=i;
            }
        }
        System.out.println("El numero mayor es: "+max);
        System.out.println("Posicion: "+posA);
        System.out.println("El numero menor es: "+min);
        System.out.println("Posicion: "+posB);
    }
}
