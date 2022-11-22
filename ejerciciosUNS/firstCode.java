package ejerciciosUNS;
// import java.util.Scanner;
import javax.swing.JOptionPane;
public class firstCode {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Bienvenido al curso de java");
        int a;
        int b;
        short c;

        // System.out.print("El valor de a: ");
        // a=sc.nextInt();
        // System.out.print("El valor de b: ");
        // b=sc.nextDouble();
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
        c = Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor de c: "));
        double suma=a+b+c;

        System.out.println(suma);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);

        JOptionPane.showMessageDialog(null, "Thanks");
    }
}
