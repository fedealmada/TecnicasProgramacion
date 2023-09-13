package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int i = 0, n, suma = 0;
        while(i < 5){
            System.out.println("Ingrese un número:");
            n = lector.nextInt();
            suma += n;
            i++;
        }
        
        System.out.println("La suma de todos los válores es de: " + suma);
    }

}
