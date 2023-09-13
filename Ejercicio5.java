package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String mes;
        double importe;
        double total;
        
        System.out.println("Ingrese un mes: ");
        mes = lector.next();
        
        System.out.println("Ingrese un importe: ");
        importe = lector.nextDouble();        
        
        if(mes.equalsIgnoreCase("octubre")){
            total = importe * 0.85;
        }
        
        else{
            total = importe;
        }
        
        System.out.println("La cantidad que se le debe cobrar al cliente es $" + total);
    }
}
