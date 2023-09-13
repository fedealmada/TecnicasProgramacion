package ejercitacionIntegradora;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int calificacion;
        System.out.println("Ingrese una calificación: ");
        calificacion = lector.nextInt();
        
        switch(calificacion){
            case 9,10:{
                System.out.println("Sobresaliente");
                break;
            }
            case 7,8:{
                System.out.println("Notable");
                break;
            }
            case 4,5,6:{
                System.out.println("Aprobado");
                break;
            }
            case 1,2,3:{
                System.out.println("Desaprobado");
                break;
            }
            default: System.out.println("Ingrese un valor entre 1 y 10");
        }
    }
}
