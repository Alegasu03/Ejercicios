package Ejercicios;

import java.util.Scanner;

public class E7EC {
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
        if (b<0){
            System.out.println("Introduce un valor mayor o igual a 0");
        }
        if (c<0){
            System.out.println("Introduce un valor mayor o igual a 0");
        }
        int media=(a+b+c)/3;
        System.out.println("La media es:" +media);













    }
}
