package Init.laboratorio;
import javax.swing.JOptionPane;
/*Hacer un programa que pida el ingreso del código, nombre, las horas trabajadas por un trabajador y el descuento por ley, luego de esto el programa debe calcular el sueldo bruto, sueldo neto e imprimirlo bajo el siguiente formato:
    EL SUELDO DE : <NOMBRE> CUYO CODIGO ES: <CODIGO>
    ASCIENDE A: <CANTIDAD> SUELDO BRUTO
    ASCIENDE A:<CANTIDAD> SUELDO NETO */ 

public class ejercicio10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a EPISIcorp");
        int code;
        String name;
        int hour;
        int discount;
        double pay=100;
        code = Integer.parseInt(JOptionPane.showInputDialog("Codigo de trabajador: "));
        System.out.println(code);
        name = JOptionPane.showInputDialog("Nombre: ");
        System.out.println(name);
        hour = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas: "));
        System.out.println(hour);
        discount = Integer.parseInt(JOptionPane.showInputDialog("Descuento %: "));
        System.out.println(discount);

        /*Sueldo bruto */
        double sbruto=(double) pay*hour;
        double sneto=(double) (100-discount)*sbruto/100;

        JOptionPane.showMessageDialog(null, "El sueldo de: " + name);
        JOptionPane.showMessageDialog(null, "Asciende a : S/." + sbruto+" sueldo bruto");
        JOptionPane.showMessageDialog(null, "Asciende a: S/." + sneto+" sueldo neto");
    }
}
