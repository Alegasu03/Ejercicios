package Ejercicios;

import java.util.Scanner;

public class E2EC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inroduce el día de la semana y sabrás que tienes a primera hora ese día");
        String Día = sc.nextLine();
        if (Día.equals("Lunes")) {
            System.out.println("Te toca Bases de Datos");
        }
        else if (Día.equals("Martes")) {
            System.out.println("Te toca Lenguaje de marcas");

        }
        else if (Día.equals("Miercoles")) {
            System.out.println("Te toca programación");

        }
        else if (Día.equals("Jueves")) {
            System.out.println("Te toca Bases de datos");
        }

        else if (Día.equals("Viernes")) {
        System.out.println("Te toca Fol");
    }
        else{
            System.out.println("Introduce un dato válido");
}
}
}