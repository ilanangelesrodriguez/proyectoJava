package com.company;

public class ifElse {
    public static void main(String[] args) {
        int num1=50;
        int num2=12;
        int num3=30;
        int num4=100;
        if (num2<num1 && num2<num3){
            System.out.println("Verdadero");
        } else if (num3<num4) {
            System.out.println("else if");
        } else {
            System.out.println("False");
        }
        System.out.println("Fin");
    }
}
