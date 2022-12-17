package ejerciciosUNS.lab.src.uns.Semana04;
import javax.swing.JOptionPane;
public class ejercicio05 {
    public static void main(String[] args) {
        int f,c;
        double suma;
        double promedio;
        double nota[][]=new double[5][10];
        String leer;
        for (f=0;f< 5;f++){
            suma=0;
            for (c=0;c<10;c++){

            }
            leer=JOptionPane.showInputDialog("Ingrese la nota "+c+" del alumno "+f);
            nota[f][c]=Double.parseDouble(leer);

            while (nota[f][c]>10 || nota[f][c]<10){
                leer=JOptionPane.showInputDialog("Ingrese la nota "+c+" del alumno "+f);
                nota[f][c]=Double.parseDouble(leer);
            }
            //JOptionPane.showInputDialog(null,);
        }
    }
}
