package uns.Semana04;
import java.util.*;
public class ejercicio04 {
    public static void main(String[] args) {
        //Genere 20 numeros enteros aleatorios entre 0 y 99 y almacene en un array
        //Crear un nuevo arreglo con los numeros primos que haya
        System.out.println("|------ Numeros aleatorios -----|");
        Scanner sc=new Scanner(System.in);
        int [] arreglo=new int[20];
        float number= 0;
        int np=0;
        for (int i=0;i< arreglo.length;i++){
            number=(float)Math.random()*100;
            arreglo[i]=(int) number;
            System.out.println(arreglo[i]);
            if (arreglo[i]%arreglo[i]==0){
                if (arreglo[i]%1 ==0){
                    for (int j=1;j<=10;j++){
                        if (arreglo[i]%j!=0){
                            np=arreglo[i];
                            System.out.println("El valor del arreglo["+i+"] es primo= "+np);
                        }
                    }
                }
            }
        }

    }
}
