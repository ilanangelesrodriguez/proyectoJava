public class Main {
    public static void main(String[] args) {
        System.out.println("*+--- Métodos ---+*");

        int valA=5;
        int valB=10;

        suma(valA,valB);

        System.out.println(valA);
        System.out.println(valB);

        Coche coche=new Coche();
        ejecutarAcelerar(coche);
    }
    public static int suma(int A,int B){
        return A + B;
    }
    //Recursivo
    public static int factorial(int numero){
        int resultado;
        if(numero==1){
            return 1;
        }
        resultado=factorial(numero-1)*numero;
        return resultado;
    }
    //No recursivo
    public static int factorialNR(int numero){
        int temp;
        int resultado=1;
        for (temp=1;temp<=numero;temp++){
            resultado=resultado*temp;
        }
        return resultado;
    }
    public static void ejecutarAcelerar(Vehiculo vehiculo){
        vehiculo.acelerar(15);
    }
}
interface Vehiculo{
    void acelerar(int velocidad);
    void frenar(int velocidad);
}
class Coche implements Vehiculo {
    public void acelerar(int velocidad){
        System.out.println("Coche() --> Acelerar()");
    }
    public void frenar(int velocidad){
        System.out.println("Coche() --> Frenar()");
    }
}