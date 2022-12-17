package uns.Semana04;

public class ejercicio01 {
    public static void main(String[] args) {
        System.out.println("|---- Arreglos ----|");
        //Numeros del 1 al 10
        int [] number=new int [100];
        int suma=0;
        for (int i=0;i<number.length;i++){
            number[i]=i+1;
            suma=suma+number[i];
            //System.out.println("La suma de los "+i+" es= "+suma);
        }
        System.out.println("La suma de los "+number.length+" es= "+suma);
        float media=(float) suma/ number.length;
        System.out.println("media: "+(media));
    }
}
