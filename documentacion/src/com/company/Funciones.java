package com.company;

public class Funciones {
    public static void main(String[] args) {
        //saludar("Ilan");
        //String saludo=nSaludar();
        //System.out.println(saludo);
        holaMundo();
        holaMundo("Ilan");
        holaMundo(12);
        holaMundo("Ilan","CEO.");
    }
    public static void saludar(String persona){
        System.out.println("Hola "+persona);
    }
    private static String nSaludar(){return "Hola";}
    public static void holaMundo(){
        System.out.println("Hola");
    }
    public static void holaMundo(String nombre){
        System.out.println("Hola "+nombre);
    }
    public static void holaMundo(Integer number){
        System.out.println("El numero es: "+number);
    }
    protected static void holaMundo(String nombre, String cargo){
        System.out.println("Hola "+nombre+".Soy el "+cargo);
    }
}
