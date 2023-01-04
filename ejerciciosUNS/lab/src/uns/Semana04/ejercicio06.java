package uns.Semana04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio06 {
    //Suma matriz
    public static void main(String[] args)throws IOException {
        BufferedReader tc= new BufferedReader(new InputStreamReader(System.in));
        int M[][];
        int n;
        int m;
        int sumaTotal;
        int[] sumaFilas;
        int[] sumaColumas;
        int max;
        int min;

        System.out.print("Ingrese el numero de filas: ");
        n=Integer.parseInt(tc.readLine());

        System.out.print("Ingrese el numero de columnas: ");
        m=Integer.parseInt(tc.readLine());

        sumaFilas=new int[n];
        sumaColumas=new int[m];
        M=new int[n][m];
        llenar(M,n,m);

        sumaTotal=0;
        max=-999999;
        min=999999;
        for (int i=0;i<n;i++){
            for (int k=0;k<m;k++){
                sumaTotal=sumaTotal+M[i][k];
                sumaFilas[i]=sumaFilas[i]+M[i][k];
                if (M[i][k]>max){
                    max=M[i][k];
                }
                if (M[i][k]<min){
                    min=M[i][k];
                }
            }
        }

        //Suma de columnas
        for (int k=0;k<m;k++){
            for (int i=0;i<n;i++){
                sumaColumas[k]=sumaColumas[k]+M[i][k];
            }
        }

        for (int i=0;i<n;i++) {
            for (int k=0; k < m; k++) {
                System.out.print(" "+M[i][k]);
                System.out.println(" = "+sumaFilas[i]);
            }
        }
    }
    public static void llenar(int M[][], int n, int m) {
        for (int i=0;i<n;i++) {
            for (int k=0; k < m; k++) {
                M[i][k]=(int) Math.random()*10;
            }
        }
    }
}
//
