package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E9EB {
    public static void main(String[] args) {
        int introducido=0;
        int cifras=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        introducido=sc.nextInt();
        while (introducido!=0){
            introducido=introducido/10;
            cifras++;



        }
        System.out.println("El número tiene " +cifras);
    }

}
