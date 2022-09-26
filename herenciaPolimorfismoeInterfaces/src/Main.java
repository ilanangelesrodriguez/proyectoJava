import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String respuesta=sc.nextLine();
        System.out.println("Bienvenido, "+respuesta);
        Coche coche=new Coche();
        coche.velocidadMaxima=12;
        coche.matricula="ABCD 1234";

        System.out.print("La matricula es: ");
        System.out.println(coche.compruebaMatricula("AAA"));

        System.out.println("Suma de numeros");
        //coche.sumaNumeros(2.5,2.2);
        coche.sumaNumeros((float) 21,(float) 1.1);
    }
}
class vehiculo {
    int velocidadMaxima;
    String matricula;
    public boolean compruebaMatricula(String matricula){
        if(matricula=="ABCD") {
            return true;
        }
        return false;
    }
}

class motor {
    String tipoMotor;
    public motor(){
        System.out.println("Es el constructor de motor");
    }
}
class Coche extends vehiculo{
    public void diHola(){
        System.out.println("Es un coche");
    }
    public int sumaNumeros(int a, int b){
        System.out.println("Soy el suma de numero de int");
        return a+b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Soy el suma de numero de float");
        return a+b;
    }
    public void sumaNumeros(double a, double b){
        System.out.println("Soy el suma de numero de double");
        System.out.println("El resultado es: "+(a+b));
    }
}
interface vehiculo1{
    void acelerar(int velocidad);
    void frenar(int velocidad);

    class coche1 implements vehiculo1{
        public void acelerar(int velocidad){
        }
        public void frenar(int velocidad){
        }
}
}
