package paquetePruebas.scannerExample;

import java.util.Scanner;

public class NumberCompare {
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Ingrese el primer número: ");
         int firstNumber = scanner.nextInt();

         System.out.println("Ingrese el segundo número: ");
         int secondNumber = scanner.nextInt();

         int sum = firstNumber + secondNumber;
         int difference = firstNumber - secondNumber;

         System.out.println("La suma de a + b = " + sum);
         System.out.println("La diferencia de a - b = " + difference);

         if(firstNumber>secondNumber){
             System.out.println("El primer numero es mayor: ");
         }else{
             System.out.println("El segundo numero es igual o mayor: ");
         }
        System.out.println("Fin de la app");
         scanner.close();
    }
}

