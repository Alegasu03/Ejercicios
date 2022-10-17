package Ejercicios;

import java.util.Scanner;

public class E4EC {
    public static void main(String[] args) {
       int ordinarias=12;
       int extraordinarias=12;
        System.out.println("Introduce las horas trabajas esta semana");
        Scanner sc =new Scanner(System.in);
    int horas=sc.nextInt();
    if (horas<=40) {
    int salario1=horas*ordinarias;
        System.out.println(horas+"*"+ordinarias+"="+salario1);
    }
    else if(horas>40) {
        int resta = (horas - 40)*16;
        int salario2=40*ordinarias + resta;
        System.out.println(40+"*"+ordinarias+"+"+resta+"="+salario2);

    }
    else {
        System.out.println("Introduce un dato válido");
    }




















    }
}
