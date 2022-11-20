package Init.laboratorio;
import java.util.Scanner;
/*Un granjero desea saber el porcentaje de cada animal que tiene en su granja, se sabe que tiene patos, gallinas, cerdos y conejos. Diseñar el programa que permita mostrar el total de animales y el porcentaje que representa cada uno. (Datos de entrada: cantidad de patos, gallinas, cerdos y conejos) */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N° de patos: ");
        int patos=sc.nextInt();
        System.out.print("N° de gallinas: ");
        int gallinas=sc.nextInt();
        System.out.print("N° de cerdos: ");
        int cerdos=sc.nextInt();
        System.out.print("N° de conejos: ");
        int conejos=sc.nextInt();

        int total=patos+gallinas+cerdos+conejos;
        System.out.println("Hay "+total+" animales.");
        System.out.println("+-----Porcentaje-----+");
        //Porcentaje de patos
        float ppatos=(float) (patos*100)/total;
        System.out.println("Patos: "+ppatos+"%");
        //Porcentaje de gallinas
        float pgallinas=(float) (gallinas*100)/total;
        System.out.println("Gallinas: "+pgallinas+"%");
        //Porcentaje de cerdos
        float pcerdos=(float) (cerdos*100)/total;
        System.out.println("Cerdos: "+pcerdos+"%");
        //Porcentaje de conejos
        float pconejos=(float) (conejos*100)/total;
        System.out.println("Conejos: "+pconejos+"%");
        sc.close();
    }
}
