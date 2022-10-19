package Ejercicios;

import java.util.Scanner;

public class E6EC {
    public static void main(String[] args) {
        int h=0;
        final  double  G=9.81;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor para la altura");
        h = sc.nextInt();
        double resultado= Math.sqrt(2*h*G);
        System.out.println("El tiempo que tardará es: " +(Math.sqrt(2*h*G))+ "="+resultado);
    if (h<0) {
        System.out.println("La altura no puede valer 0");



    }

    }
}
