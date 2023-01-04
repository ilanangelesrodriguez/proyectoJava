package uns.Semana08;

public class ejercicio01 {
    public static void main(String[] args) {
        //Crear la clase Cuadrilatero y abstraer los atributos y métodos necesarios
        //para calcular su área y perímetro.
        System.out.println("|------ Ejercicio 01 ------|");
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        cuadrilatero.lado=4;
        cuadrilatero.nlados=4;
        cuadrilatero.areaCuadrilatero(cuadrilatero.lado);
        cuadrilatero.perimetroCuadrilatero(cuadrilatero.lado, cuadrilatero.nlados);
    }
}
class Cuadrilatero {
    int lado;
    int nlados;
    public void areaCuadrilatero(int lado){
        int area=lado*lado;
        System.out.println("El area es: "+area);
    }
    public void perimetroCuadrilatero(int lado, int nlados){
        int perimetro=nlados*lado;
        System.out.println("El perimetro es: "+perimetro);
    }
}
