package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int year;
        System.out.println("Ingrese un año: ");
        year = lector.nextInt();
        
        if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0){
            System.out.println("Es bisiesto");
        }
        
        else{
            System.out.println("No es bisiesto");
        }    
    }
}
