package uns.Semana02;
import javax.swing.JOptionPane;
/*
 * author: Ilan Nestor Angeles Rodriguez
 */
public class mayorInterMin {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al curso de java");
        int x = Integer.parseInt(JOptionPane.showInputDialog("N° de datos: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1: "));
        int mayor=a;
        int menor=a;

        for(int i=0;i<x-1;i++){
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de "+(i+2)+": "));

            if(a>=mayor){
                mayor=a;
            } 
            if(a<=menor){
                menor=a;
            }
        }
        JOptionPane.showMessageDialog(null, "El valor mayor es: "+mayor);
        JOptionPane.showMessageDialog(null, "El valor menor es: "+menor);
        System.out.println("El valor mayor es: "+mayor);
        System.out.println("El valor menor es: "+menor);
    }
}
