package Ejercicios;

import java.util.Scanner;

public class E7EB {
    public static void main(String[] args) {
        final int codigo = 5869;
        int codigointro = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        codigointro = sc.nextInt();
        int intento=0;
        while (codigointro != codigo && intento!=3) {
            System.out.println("Vuelve a introducir el código");
            codigointro = sc.nextInt();
            intento++;
        }
            if (codigointro == codigo) {
                System.out.println("Has acertado la contrseña");
            }
            else if (intento == 3) {
                System.out.println("Se acabaron los intentos");
            }
        }
    }






