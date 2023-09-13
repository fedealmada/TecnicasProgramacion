package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Defino los válores n1, n2, n3, numeroMayor
        int n1, n2, n3, numeroMayor;
        
        // Inicializo numeroMayor
        numeroMayor = 0;
        
        // Pido por teclado los válores para n1, n2 y n3
        
        System.out.println("Ingrese el primer número");
        n1 = lector.nextInt();
        
        System.out.println("Ingrese el segundo número");
        n2 = lector.nextInt();
        
        System.out.println("Ingrese el tercer número");
        n3 = lector.nextInt();
        
        // Si son distintos muestro en pantalla que el usuario debe ingresar numeros distintos
        
        if(n1 == n2 || n2 == n3){
            System.out.println("Debes ingresar números distintos");
        }
        
        // Sino calculo el número mayor de los 3 válores ingresados
        else{
            if(n1 > numeroMayor){
                numeroMayor = n1;
            }
            if(n2 > n1){
                numeroMayor = n2;
            }
            if(n3 > n2){
                numeroMayor = n3;
            }
            
            System.out.println("El número mayor es: " + numeroMayor);
        }
    }
}
