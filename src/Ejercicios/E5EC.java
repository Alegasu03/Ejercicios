package Ejercicios;

import java.util.Scanner;

public class E5EC {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un valor para a");
        a=sc.nextInt();
        System.out.println("Introduce un valor para b");
        b=sc.nextInt();
        if (a==0) {
            System.out.println("Error, introduce un dato válido");
        }
        else if (a>0 && b>0 || a<0 && b<0 || a<0 && b>0 || a>0 && b<0) {
          int resultado=-b/a;
            System.out.println("El valor de X es:" +(-b)+"/"+a+"="+resultado);
        }
        else if (b==0) {
            System.out.println("El valor de X es: 0");
        }
        else {
            System.out.println("Introduce un dato válido porfavor");
        }

















    }
}
