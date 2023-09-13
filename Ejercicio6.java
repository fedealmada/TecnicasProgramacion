package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int n;
        System.out.println("Ingrese un número: ");
        n = lector.nextInt();
        
        if(n % 2 == 0){
            System.out.println("El número " + n + " es par");
        }
        else{
            System.out.println("El número "  + n + " es impar");
        }
    }
}
