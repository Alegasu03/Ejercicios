package Ejercicios;

import java.util.Scanner;

public class E8EC {

    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un valor para a");
        a= sc.nextInt();
        System.out.println("Introduce un valor para b");
        b= sc.nextInt();
        System.out.println("Introduce un valor para c");
        c= sc.nextInt();

        if (a<0) {
            System.out.println("Introduce un valor mayor o igual a 0");
        }
        else if (b<0){
            System.out.println("Introduce un valor mayor o igual a 0");
        }
        else if (c<0){
            System.out.println("Introduce un valor mayor o igual a 0");
        }

        int media=(a+b+c)/3;
        System.out.println("La media es:" +media);
        if (media>=0 && media<5) {
            System.out.println("Tienes un insuficiente");
        }
        else if (media>=5 && media<6) {
            System.out.println("Tienes un suficiente");

        }
        else if (media>=6 && media<7) {
            System.out.println("Tienes un bien");
        }
        else if (media>=7 && media<9) {
            System.out.println("Tienes un notable");
        }
        else if (media>=9 && media<=10) {
            System.out.println("Tienes un sobresaliente");
        }
        else {
            System.out.println("Error");
        }

    }
}

