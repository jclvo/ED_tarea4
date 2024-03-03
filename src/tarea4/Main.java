package tarea4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad en años: ");
        int edad = scanner.nextInt();
        
        Persona persona = new Persona(edad);
        
        int anosParaJubilacion = persona.calcularAnosHastaJubilacion();
        
        if (anosParaJubilacion < 10) {
            System.out.println("¡Solo te quedan " + anosParaJubilacion + " años! ¡Vamos que ya queda poco!");
        } else if (anosParaJubilacion > 20) {
            System.out.println("Te quedan " + anosParaJubilacion + " años. ¡A seguir trabajando gandul!");
        }
    }
}
