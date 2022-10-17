package Ejercicios;

import java.util.Scanner;

public class E3EC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la hora");
        int Hora=sc.nextInt();
        if (Hora>=6 && Hora<=12){
            System.out.println("Buenos Días");
        }
        else if (Hora>=13 && Hora<=20){
            System.out.println("Buenas tardes");
        }
        else if (Hora>=21 && Hora<=24){
            System.out.println("Buenas noches");
        }
        else if (Hora>=0 && Hora<=5){
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("Introduce un valor válido");
        }
    }
}
