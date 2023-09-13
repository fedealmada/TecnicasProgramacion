package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n1, n2, n3, resultado;
        
        System.out.println("Ingrese el primer número:");
        n1 = lector.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        n2 = lector.nextInt();    
        
        System.out.println("Ingrese el tercer número:");
        n3 = lector.nextInt();
        
        if(n1 < 0){
            resultado = n1 * n2 * n3;
            
        }
        else{
            resultado = n1 + n2 + n3;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
