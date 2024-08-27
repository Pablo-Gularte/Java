/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase04;

/**
 *
 * @author Alumno
 */
public class Clase04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CONSTANTES
        
        /*
        Las constantes son similares a las variables.
        REpresentan un espacio en memoria, tienen un identificador
        y almacenan un valor con un tipo de dato asocinalado.
        PEro la diferencia principal es que, a diferencia de las
        variables, las constantes no pueden cambiar su valor.
        Deben llevafr la palabra reservada "f"
        */
        
        final double PI = 3.14;
        // por convención los nombres de constantes van con mayúscula
        // PI = 3.15; error
        
        // COncatenación
        // operador +
        
        String nombre = "Marcelo";
        String apellido = "Gonzalez";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + apellido);
        System.out.println(nombre + " " + apellido);
        System.out.println("Su nombre es: " + nombre + " " + apellido);
        
        String texto = "este es un texto";
        String texto2 = "OTRO TEXTO";
        System.out.println(texto.toUpperCase());
        System.out.println(texto2.toLowerCase());
        
        // **********************
        // Operadores aritméticos
        // **********************
        /*
        + suma
        - resta
        * multiplicación
        / división
        % resto o módulo de la división
        
        Son operadores binarios porque necesitan de dos operandos.
        Los operandos son numéricos y el resultado es numérico.
        */
        
        int nro1 = 10;
        int nro2 = 2;
        
        System.out.print("Suma: ");
        System.out.println(nro1 + nro2);
        
        System.out.print("Resta: ");
        System.out.println(nro1 - nro2);
        
        System.out.print("Multiplicación: ");
        System.out.println(nro1 * nro2);
        
        System.out.print("División: ");
        System.out.println(nro1 / nro2);
        
        System.out.print("Módulo o resto: ");
        System.out.println(nro1 % nro2);
        
        // Operadores de asignación
        /*
        =   asignación
        +=  suma y asignación
        -=  resta y asignación
        *=  multiplicación y asignación
        /=  división y asignación
        %=  módulo y asignación
        
        Son operadores binarios.
        Asignan el valor a una variable y se la modifican utilizando una expresión.
        */
        
        System.out.println(nro1);
        System.out.println(nro1 += 2);
        System.out.println(nro1);
        System.out.println(nro1 += 2);
        System.out.println(nro1 -= 2);
        System.out.println(nro1 *= 2);
        System.out.println(nro1 /= 2);
        System.out.println(nro1 %= 2);
        
        // OPeradores incrementales y decrementales
        /*
        ++ incrementa el valor de la variable en 1
        -- decrementa el valor de la variable en 1
        Son operadores unarios, trabajan con un solo operando.
        */
        
        System.out.println(nro1);
        nro1++;
        System.out.println(nro1);
        nro1--;
        System.out.println(nro1);
        
        // Operadores relacionales
        /*
        >   Mayor que
        <   Menor que
        >=  Mayor o igual que
        <=  Menor o igual que
        ==  Igual
        !=  Distinto
        Son operadores binarios.
        Los operandos son numéricos pero el resultado es booleano.
        */
        
        nro1 = 15;
        nro2 = 20;
        
        System.out.println(nro1 > nro2);
        System.out.println(nro1 < nro2);
        System.out.println(nro1 >= nro2);
        System.out.println(nro1 <= nro2);
        System.out.println(nro1 == nro2);
        System.out.println(nro1 != nro2);
        
        // Tabla de verdad
        // es una representación lógica de resultados
        /*
        A   B   AND OR
        V   V   V   V
        V   F   F   V
        F   V   F   V
        F   F   F   F
        
        Negación (NOT)
        A   NOT
        V   F
        F   V
        */
        
        //Operadores lógicos
        /*
        &   AND
        |   OR
        !   NOT
        Los operandos son booleanos.
        El resultado es booleano.
        */
        
        boolean log1 = true;
        boolean log2 = false;
        
        /*
        Un solo operador lógico & o | evalúa ambas condiciones.
        Al utilizar dos && o || si con una condición determinar el
        valor de verdad, no evalúa la que sigue.
        */
        
        System.out.print("AND &&:");
        System.out.println(log1 && log2); //false
        
        System.out.print("OR ||:");
        System.out.println(log1 || log2); //true
        
        System.out.print("NOT:");
        System.out.println(!log1); //false
        System.out.print("NOT:");
        System.out.println(!log2); //true
    }
    
}
