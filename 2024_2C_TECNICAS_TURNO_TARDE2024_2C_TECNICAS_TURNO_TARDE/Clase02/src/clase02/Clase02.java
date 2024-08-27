/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase02;

/**
 *
 * @author Alumno 14
 */
public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hola mundo!");  // esto es una sentencia
        // una sentenciaa es una orden que le damos al programa
        // pára qie realice una traeaa específica.
        // Las sentencias finalizan con ;
        // El ; es el separaador de sentencias

        // Impresión con salto de línea
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        // impresión sin salto de linea
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");

        System.out.println("");

        /*
            variables
         */
 /*
        Una variable es un nombre que se asocia con una porción
        de memoria del ordenador, en donde se guarda un varlor asignado a esa
        variable.
        Las variables deben declararse antes de usarlas.
        La declaración es una sentencia en la que figura el tipo de dato y el 
        nombre (identificador) que le asignamos a la variable.
         */
        int a; // declaración de vvariable indicando identificador y tipo de dato
        a = 2; // asignación de valor a la variable
        int b = 3; // declaración y asignación de valor en línea
        a = 4; // cambia el valor a la vaariable

//        a = "hola"; error: no se puede cambiar el tipo de dato del valor
//        int a; error: la variable ya existe
//        char a; error: no se puede utilizar el mismo nombre de variable
        int c = 12, d = 32, e = 42; // delcaración y asignación múltiple en línea

        /*
            Tipos de datos primitivos
         */
        // byte
        // ocupa 1 byte y representa un número entero etre -128 y 127
        byte f = 100;
        System.out.println(f);
        
        // short
        // ocupa 2 bytes
        // y representa un número entero entre -32.768 y 32.767
        short g = -32768;
        System.out.println(g);
        
        // int
        // opcupa 4 bytes
        // representa un número entre -2.147.483.648 y 2.147.483.647
        int h = 125464521;
        System.out.println(h);
        
        // long
        // ocup 8 bytes
        // representa un entero de valor muy grande (entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807)
        long i = 24135513211354113L; // debe llevar una l al final
        // por convención la L es mayúscula
        // no separamos los miles
        System.out.println(i);
        
        // float
        // ocupa 4 bytes - tiene una precisión de 32 bits
        // representa números con decimales
        float j = 14.25f; // debe llevar una f al final de su valor
        // los decimales se separan con el punto
        
        // double
        // ocupa 8 bytes
        double k = 23.45;
        System.out.println(k);
        
        // diferencia entre float y double
        float fl = 10f;
        double dl = 10;
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        // boolean
        // ocupa 1 byte y almacena solo 2 valores (0 y 1)
        // representados por verdadero y falso (true y false)
        boolean l = true; // asigna el valor de "verdad"
        boolean m = false; // asigna el valor de "falso"
        System.out.println(l);
        System.out.println(m);
        
        // char
        // ocupa 2 bytes
        // almacen un número entero que representa un caracter de la tabla 
        // Unicode 
        char n = 65;
        System.out.println(n);
        // si a una letra mayúscula le sumo 32 la paso a minpuscula
        n += 32;
        System.out.println(n);
        // también se puede almacenar el caracter directamente
        n = 'f';
        System.out.println(n);
        
        // String
        // es una clase, o es un tipo de dato primitivo
        // representa una cadena de caracteres
        String o = "Hola"; // las cadenas de caracteres van dentro de ""
        // al ser una clase comienza con mayúscula
        System.out.println(o);
        
    }

}
