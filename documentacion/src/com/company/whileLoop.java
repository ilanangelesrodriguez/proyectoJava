package com.company;

public class whileLoop {
    public static void main(String[] args) {
        int count=0;
        while (count<5){
            //System.out.println("Posicion "+count);
            count++;
            if (count==2){
                continue;
                //break;
            }
            System.out.println("Posicion "+count);
        }
        System.out.println("Fin");
    }
}
