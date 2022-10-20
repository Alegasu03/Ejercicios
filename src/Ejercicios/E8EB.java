package Ejercicios;

import java.util.Scanner;

public class E8EB {
    public static void main(String[] args) {

        int numero = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = sc.nextInt();
        for (i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println("La tabla del " + numero + " es " + numero + "x" + i + "=" + resultado);
        }


    }
}



