package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int n;
        System.out.println("Ingrese un número: ");
        n = lector.nextInt();
        
        if(n < 0){
            System.out.println("El número es negativo");
        }
        else if(n > 0){
            System.out.println("El número es positivo");
        }
        
        else{
            System.out.println("El número es cero");
        }   
    }
}
