package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E9EC {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor para a");
        a= sc.nextInt();
        System.out.println("Introduce un valor para b");
        b=sc.nextInt();
        System.out.println("Introduce un valor para c");
        c= sc.nextInt();

        if (a==0) {
        int resultado=-c/b;
            System.out.println("El valor de X es: " +(-c)+ "/" +b+ "=" +resultado);
        }
        else if (b==0 && c<0) {
        double resultado2= (int) Math.sqrt(c/a);
            System.out.println("El valor de X es: " +(Math.sqrt(c/a))+ "=" +resultado2);
        }



}
}