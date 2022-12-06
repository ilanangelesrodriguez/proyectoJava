package ejerciciosUNS.lab.src.uns.semana03;
/*
 * author: Ilan Nestor Angeles Rodriguez
 */
import java.util.Scanner;
public class problema01 {
    public static void main(String[] args) {
        //Instanciamietno del scanner
        Scanner sc= new Scanner(System.in);
        System.out.println("|--- Tabla de amortizacion ---|");
        //Declaro y defino variables para la tabla de amortizacion
        System.out.print("Salario: S/.");//9
        double salary= sc.nextDouble();
        //double salary= 99999999.99;
        System.out.print("interes anual: ");//9
        double annualInterest= sc.nextDouble();
        //double annualInterest=999.99;
        //Interes mensual
        double monthlyInterest=annualInterest/12;
        double Interest=salary*monthlyInterest/1200;
        System.out.print("N° de meses: ");//9
        int months= sc.nextInt();
        //Cuota fija
        double fixedFee=salary/months;
        //Mensualidad
        double monthlyPayment=fixedFee+Interest;
        
        //Totales
        //double totals=fixedFee*monthlyPayment*monthlyInterest;

        double tsalary=0;
        double tfixedFee=0;
        double tInterest=0;
        double tmonthlyPayment=0;
        for(int i=0; i<1;i++){
            System.out.print("| MES |");
            System.out.print(" SALDO INSOLUTO |");
            System.out.print(" CUOTA FIJA |");
            System.out.print(" INTERES |");
            System.out.println(" MENSUALIDAD |");
            for(int j=0;j<months;j++){
                System.out.print("   "+(j+1)+"   ");
                System.out.print("  "+salary);
                tsalary=tsalary+salary;
                System.out.print("  "+fixedFee);
                tfixedFee=tfixedFee+fixedFee;
                System.out.print("  "+Interest);
                tInterest=tInterest+Interest;
                System.out.println(" "+monthlyPayment);
                tmonthlyPayment=tmonthlyPayment+monthlyPayment;
            }
            System.out.print("TOTALES  ");
            System.out.print(""+tsalary+" ");
            System.out.print(" "+tfixedFee+" ");
            System.out.print(" "+tInterest+" ");
            System.out.println(" "+tmonthlyPayment+" ");
        }
        sc.close();

    }
}