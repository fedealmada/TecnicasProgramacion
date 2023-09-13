package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Menú de recomendaciones");
        System.out.println("1. Literatura");
        System.out.println("2. Cine");
        System.out.println("3. Música");
        System.out.println("4. Videojuegos");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Elija una opción: ");
        int opcion = lector.nextInt();
        
        switch(opcion){
            case 1:{
                System.out.println("Lecturas recomendables:");
                System.out.println("+ Esperándolo a Tito y otros cuentos de fútbol (Eduardo Saheri)");
                System.out.println("+ El juego de Ender (Orson Scott Card)");
                System.out.println("+ El sueño de los héroes (Adolfo Bioy Casares)");
                break;
            }
            
            case 2:{
                System.out.println("Peliculas recomendables:");
                System.out.println("+ Matrix (1999)");
                System.out.println("+ El último Samurai (2003)");
                System.out.println("+ Cars (2006)");
                break;
            }
            
            case 3:{
                System.out.println("Discos recomedables:");
                System.out.println("+ Despedazado por mil partes (La Renga, 1996)");
                System.out.println("+ Búfalo (La Mississipi, 2008)");
                System.out.println("+ Gaia (Mago de Oz, 2003)");
                break;
            }
            
            case 4:{
                System.out.println("Videojuegos clásicos recomendables:");
                System.out.println("+ Día del tentáculo (LucasArts, 1993)");
                System.out.println("+ Terminal Velocity (Terminal Reality/3D Realms, 1995)");
                System.out.println("+ Death Rally (Remedy/Apogee, 1996)");
                break;
            }
            case 5:{
                System.out.println("Mensaje de salida:");
                System.out.println("+ Adiós!");
                break;
            }
            
            default:{
                System.out.println("Opción no válida");
            }
        }
    }
}
