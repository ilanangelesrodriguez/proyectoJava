import java.util.Scanner;

public class sentenciasDeControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicios de Sentencias de control");
        System.out.println("1.Condicional If");
        System.out.println("2.Bucle While");
        System.out.println("3.Bucle Do While");
        System.out.println("4.Bucle For");
        System.out.println("5.Sentencia Switch");
        System.out.print("Selecciona una opcion: ");
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1:
            System.out.println("Condicional If");
                /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
                Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
                try{
                    System.out.print("Hola, introduce un numero: ");
                    int numeroIf=sc.nextInt();
                    if(numeroIf>0){
                        System.out.println("El numero es positivo");
                    } else if(numeroIf==0){
                        System.out.println("El numero es cero"); 
                    } else{
                        System.out.println("El numero es negativo");
                    }
                } finally{
                    sc.close();
                }
            break;
            case 2:
            System.out.println("Bucle While");
                /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea 
                inferior a 3, el bloque de código que tendrá el bucle deberá:
                Incrementar el valor de la variable en uno cada vez que se ejecute.
                Mostrarlo por pantalla cada vez que se ejecute.*/
                try{
                    System.out.print("Hola, introduce un numero: ");
                    int numeroWhile=sc.nextInt();
                    while(numeroWhile<3){
                        System.out.println("El valor de la variable es "+numeroWhile);
                        numeroWhile=numeroWhile+1;
                    }
                } finally{
                    sc.close();
                }
            break;
            case 3:
            System.out.println("Bucle Do While");
                /*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe 
                ejecutar una vez.*/
                try{
                    System.out.print("Hola, introduce un numero: ");
                    int numeroDoWhile=sc.nextInt();
                    do{
                        System.out.println("El valor de la variable es "+numeroDoWhile);
                        numeroDoWhile=numeroDoWhile+1;
                    }while(numeroDoWhile<3);
                } finally{
                    sc.close();
                }
            break;
            case 4:
            System.out.println("Bucle For");
                /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
                y su condición será que la variable sea igual o menor que 3, se irá incrementando en 
                1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
                try{
                    System.out.print("Hola, introduce un numero: ");
                    int numeroFor=sc.nextInt();
                    for(numeroFor=0;numeroFor<=3;numeroFor++){
                        System.out.println("El valor de la variable es: "+numeroFor);
                        numeroFor=numeroFor+1;
                    }
                } finally{
                    sc.close();
                }
            break;
            case 5:
            System.out.println("Sentencia Switch");
                /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para 
                las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá 
                mandar un mensaje por consola informando de la estación en la que está. También habrá que 
                poner un default para cuando el valor de la variable no sea una estación.*/
                try{
                    System.out.println("Estaciones del año");
                    System.out.println("1. Verano");
                    System.out.println("2. Otoño");
                    System.out.println("3. Invierno");
                    System.out.println("4. Primavera");
                    int estacion=sc.nextInt();
                    switch(estacion){
                        case 1:
                        System.out.println("Estas en verano");
                        break;
                        case 2:
                        System.out.println("Estas en otoño");
                        break;
                        case 3:
                        System.out.println("Estas en invierno");
                        break;
                        case 4:
                        System.out.println("Estas en primavera");
                        break;
                        default:
                        System.out.println("Opcion incorrecta");
                    }
                } finally{
                    sc.close();
                }
            break;
        }
    }
}