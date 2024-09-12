/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdeswitchcase;

import java.util.Scanner;

/**
 *
 * @author WDAGUtilityAccount
 */
public class EjerciciosDeSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que simule la petición de
        una opción según el siguiente menú y muestre
        en pantalla que ha ingresado a la opción
        seleccionada con las opciones siguientes:
        
        ¡Gracias por contactarte con nosotros!
        ¿En qué podemos ayudarte?
        A) Documentación
        B) Cotización
        C) Asistencia
        D) Siniestros
        E) Información de Pagos
        F) Otras Consultas
        G) Anulación
        Escribe la letra de la opción seleccionada.
        
        Debe mostrarse:
        Has elegido Documentación (o la opción que haya elegido)
         */

        System.out.println("******************************");
        System.out.println("Ejercicio 1 - Menú de opciones");
        System.out.println("******************************\n");
        Scanner teclado = new Scanner(System.in);

        System.out.println("¡Gracias por contactarte con nosotros!");
        System.out.println("¿En qué podemos ayudarte?");
        System.out.println("A) Documentación");
        System.out.println("B) Cotización");
        System.out.println("C) Asistencia");
        System.out.println("D) Siniestros");
        System.out.println("E) Información de Pagos");
        System.out.println("F) Otras Consultas");
        System.out.println("G) Anulación");
        System.out.print("Escribe la letra de la opción seleccionada: ");
        String opcion = teclado.nextLine();

        switch (opcion) {
            case "A":
            case "a":
                System.out.println("Has elegido Documentación");
                break;
            case "B":
            case "b":
                System.out.println("Has elegido Cotización");
                break;
            case "C":
            case "c":
                System.out.println("Has elegido Asistencia");
                break;
            case "D":
            case "d":
                System.out.println("Has elegido Siniestros");
                break;
            case "E":
            case "e":
                System.out.println("Has elegido Información de Pagos");
                break;
            case "F":
            case "f":
                System.out.println("Has elegido Otras Consultas");
                break;
            case "G":
            case "g":
                System.out.println("Has elegido Anulación");
                break;
            default:
                System.out.println("La opción ingresada no está entre las reconocidas");
        }

        /*
        Solicitar al usuario que ingrese dos números.
        Luego ofrecerle un menú con las siguientes opciones:
        1-suma 2-resta 3-multiplicación 4-división
        Finalmente, mostrar el resultado de la operación
        aritmética elegida.
         */
        
        System.out.println("\n*************************");
        System.out.println("Ejercicio 2 - Calculadora");
        System.out.println("*************************\n");
        
        System.out.println("Ingrese dos números enteros y luego indique la operación a realizar");
        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();
        
        System.out.println("Indique la operación que desea realizar seleccionando el número del siguiente menú:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.print("Ingrese el número de la operación a realizar: ");
        int operacion = teclado.nextInt();
        
        switch (operacion) {
            case 1:
                System.out.println("La suma de los números ingresados es: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("La resta de los números ingresados es: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("La multiplicación de los números ingresados es: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("La división de los números ingresados es: " + (numero1 / numero2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("LA opción ingresada no está entre las reconocidas en el menú.");
        }
        
    }

}
