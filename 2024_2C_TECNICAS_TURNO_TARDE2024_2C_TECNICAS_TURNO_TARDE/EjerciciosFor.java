
/**
 *
 * @author Alumno
 */
public class EjerciciosFor {

    public static void main(String[] args) {
        /*
        Imprimir los números del 1 al 10, sin imprimir
        números 2, 5 y 9, uno abajo del otro.
         */
        System.out.println("**EJERCICIO 1 ***");
        System.out.println("Imprimir los números del 1 al 10, sin imprimir números 2, 5 y 9, uno abajo del otro.");
        for (int i = 1; i <= 10; i++) {
            if (i != 2 && i != 5 && i != 9) {
                System.out.println(i);
            }
        }

        /*
        Imprimir los números del 1 al 30 sin imprimir
        números entre el 10 y el 20 uno abajo del otro
         */
        System.out.println("\n***EJERCICIO 2 ***");
        System.out.println("Imprimir los números del 1 al 30 sin imprimir números entre el 10 y el 20 uno abajo del otro");
        for (int i = 1; i <= 30; i++) {
            if (i > 0 && i < 10 || i > 20 && i <= 30) {
                System.out.println(i);
            }
        }

        /*
        Imprimir los números del 1 al 10 salteando de
        a dos, uno abajo del otro.

        Imprimir los números del 10 al 1, uno al lado
        del otro.
        
        Imprimir la suma de los números impares del
        1 al 10.
         */
        System.out.println("\n*** EJERCICIO 3 ***");
        System.out.println("Imprimir los números del 1 al 10 salteando de a dos, uno abajo del otro.");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nImprimir los números del 10 al 1, uno al lado del otro.");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        /*
        Una persona desea invertir $1000 en un banco, el
        cual le otorga un 2% de interés mensual ¿Cuál
        será la cantidad de dinero que esta persona
        tendrá al cabo de un año?
        En el primer mes tendrá acumulado 1000 $ más
        20 $ de interés ( 2% de 1000 ). En el segundo
        mes se le sumará un 2% a la base de 1020 $ del
        mes anterior y así sucesivamente. 

         */
        System.out.println("\nEJERCICIO 4");
        System.out.println("Una persona desea invertir $1000 en un banco, el cual le otorga un 2% de interés mensual ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año? En el primer mes tendrá acumulado 1000 $ más 20 $ de interés ( 2% de 1000 ). En el segundo mes se le sumará un 2% a la base de 1020 $ del mes anterior y así sucesivamente.");
        int inversion = 1000;
        System.out.println("Capital inicial: $" + inversion);
        System.out.println("Interés mensual: 2%");
        for (int i = 1; i <= 12; i++) {
            inversion *=1.02;
            System.out.println("Capital + interés para el mes " + i + ": $" + inversion);
       }

        /*
        Crear un programa que ingrese una oración y
        muestre cuál es el carácter que más se repite.
        Consideraciones
        * No debe incluir el espacio en blanco.
        * La oración a ingresar no debe estar vacía.
        */
        
        
    }
}
