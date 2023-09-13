package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese un número: ");
        n = lector.nextInt();
        
        if(n == 0 || n < 0){
            System.out.println("[ERROR] El número debe ser mayor a cero.");
        }
        
        else{
            System.out.println("Del número " + n + " su potencia es " + n*n + " y su raiz es " + Math.sqrt(n));
        }  
    }
}
