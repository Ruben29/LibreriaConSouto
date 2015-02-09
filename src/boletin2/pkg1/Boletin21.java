package boletin2.pkg1;

import MiPaquete.Imprimir;
import java.util.Scanner;

public class Boletin21 {

    public static void main(String[] args) {
        
        float base, altura;

        System.out.print("Introduzca la base del triangulo: ");
        Scanner dato = new Scanner(System.in);
        base = dato.nextFloat();

        System.out.print("Introduzca la altura del triangulo: ");
        altura = dato.nextFloat();

        System.out.println("Área: " + (base * altura / 2) + "u");
        
        Imprimir.saludo();
        
    }

}
