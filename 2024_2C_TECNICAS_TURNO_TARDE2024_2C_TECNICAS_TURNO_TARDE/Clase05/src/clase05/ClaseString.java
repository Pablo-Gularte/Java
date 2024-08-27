/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase05;

/**
 *
 * @author Alumno
 */
public class ClaseString {

    public static void main(String[] args) {
        /*
            Formas de escrituras:
            came case ->estoEsUnaFraseEnCamelCase (tambien llamada lower camel case)
            pascal case ->EstoEsUnaFraseEnPascalCase (tambien llamada upper camel case)
            snake case ->esto_es_una_frase_en_snake_case
         */
        System.out.println("Clase String");

        //Es una clase.No es un tipo de dato primitivo.
        //Contiene un vector de caracteres
        //Podemos crear un objeto crear un objeto de la clase String de varias maneras
        String texto1 = "Cadena de Texto!";
        String texto2 = new String("hola");
        String texto3 = "hola";

        //Metodos para comparar
        //al comparar con el operador == se va a comparar que sean el
        //mismo objeto en memoria
        System.out.println(texto3 == "hola"); //true,estan en un mismo pool
        System.out.println(texto2 == "hola"); //false, no estan en el mismo 
        //lugar de memoria

        //para compartir cadenas de caracteres teniendo en cuenta su contenido
        //se utilizan .equals() .equalsIgnoreCase()
        System.out.println(texto2.equals("hola")); //true
        System.out.println(texto3.equals("hola")); //true
        System.out.println(texto2.equals(texto3)); //true
        System.out.println(texto2.equals("Hola")); //false
        
        //para no tener en cuenta las mayusculas y minusculas
        //utilizamos el .equalsIgnoreCase ()
        System.out.println(texto2.equalsIgnoreCase("Hola")); //true

        //.contains ()
        //devuelve un booleano indicando si la cadena contiene una subcadena dada
        System.out.println(texto1.contains("hola")); //false
        System.out.println(texto3.contains("hola")); //true
        System.out.println(texto2.contains("ol")); //true
        System.out.println(texto2.contains("lo")); //false

        //.length()
        //devuelve la longitud del vector, es decir, cuanto catacteres tiene
        System.out.println(texto1.length()); //16
        System.out.println(texto2.length()); //4
        System.out.println(texto3.length()); //4

        //.isEmpty()
        //indica si la cadena esta vacia, es decir, si su longitud es igual a 0
        System.out.println(texto1.isEmpty()); //false

        //.isBlank()aparece a partir del JDK 11
        //indica si una cadena esta vacia, en blanco, contiene solo espacios o
        //solo tabulaciones, o solo saltos de linea
        String texto4 = " ";
        System.out.println(texto4.isEmpty()); //false
        System.out.println(texto4.isBlank()); //true
        
        //.charAt()
        //devuelve el caracter del indice dado
        System.out.println(texto1.charAt(7)); //d
        System.out.println(texto2.charAt(2)); //l
        //System.out.println(texto1.charAt(5)); //ERROR
        // La sentencia anterior arroja error porque no existe
        // la posición 5 para un vectpor de longitud 4
        
        //.indexOf()
        // devuelve el índice de la primera ocurrencia e la subcadena
        // i no la encuentra devuelve -1
        System.out.println(texto1.indexOf("texto")); // -1
        System.out.println(texto1.indexOf(""));

    }

}
