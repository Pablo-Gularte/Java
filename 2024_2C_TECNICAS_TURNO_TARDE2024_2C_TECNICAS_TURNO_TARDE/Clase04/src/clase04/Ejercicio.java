/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase04;

/**
 *
 * @author Alumno
 */
public class Ejercicio {
    public static void main(String[] args) {
        // **********
        // EJERCICIOS
        // **********
        
        /*
        1-
        Dados num1=5, num2=10 y num3=20. Informar:
        a) num1+num2
        b) num3-num1
        c) num1*num3
        d) num3/num2
        */
        int num1=5, num2=10, num3=20;
        
        System.out.print("num1+num2: ");
        System.out.println(num1+num2);
        
        System.out.print("num3-num1: ");
        System.out.println(num3-num1);
        
        System.out.print("num1*num3: ");
        System.out.println(num1*num3);
        
        System.out.print("num3/num2: ");
        System.out.println(num3/num2);
        
        /*
        2-
        Dados nro_1=10, nro_2=20 y nro_3=30. Informar :
        a) El total de la suma de todas las variables
        b) El promedio
        c) El resto entre nro_2 y nro_1
        */
        int nro_1=10, nro_2=20, nro_3=30;
        int resultadoSumaTotal=nro_1+nro_2+nro_3;
        
        System.out.println("SUMA: " + resultadoSumaTotal);
        System.out.println("PROMEDIO: " + resultadoSumaTotal/3);
        System.out.println("RESTO: " + nro_2%nro_1);
        
        /*
        3-
        Declarar dos variables n1=5 y n2=10.
        Utilizando concatenación entre las variables y los literales, mostrar en pantalla la siguiente expresión:
        n1 es igual a 5,n2 es igual a 10 y n1 más n2 es igual a 15.
        */
        int n1=5, n2=10;
        int resultadoSuma = n1+n2;
        
        System.out.println("n1 es igual a " +
                            n1 + 
                            ", n2 es igual a " + 
                            n2 + 
                            " y n1 más n2 es igual a " + 
                            resultadoSuma + ".");
        
        /*
        4-
        Haciendo uso de la constante IVA=21, calcular el precio con IVA de los siguientes productos e
        informar:
        a) remera:$59.90
        b) pantalón:$99.90
        c) campera:$149.90
        */
        
        System.out.println("VERSIÓN 1");
        System.out.println("Utilizo una constante de tipo INT llamada IVA y un operador de tipo DOUBLE para calcular el IVA");
        final int IVA=21;
        double operador_IVA=(IVA/100)+1;
        double remera=59.9, pantalon=99.9, campera=149.9;
        
        System.out.print("Operador para calcular el IVA: ");
        System.out.println(operador_IVA);
        System.out.println("Precio con IVA de la remera: " + remera * operador_IVA);
        System.out.println("Precio con IVA del pantalon: " + pantalon * operador_IVA);
        System.out.println("Precio con IVA de la campera: " + campera * operador_IVA);
        
        System.out.println("VERSIÓN 2");
        System.out.println("Utilizo variables adicionales para el iva de cada producto");
        double iva_remera = remera * 21 / 100;
        double iva_pantalon = pantalon * 21 / 100;
        double iva_campera = campera * 21 / 100;
        
        System.out.println("Precio con IVA de la remera: " + remera + iva_remera);
        System.out.println("Precio con IVA del pantalon: " + pantalon + iva_pantalon);
        System.out.println("Precio con IVA de la campera: " + campera + iva_campera);
        
        System.out.println("VERSIÓN 3");
        System.out.println("Utilizo una constante IVA_DOUBLE");
        final double IVA_DOUBLE=21;
        operador_IVA=(IVA_DOUBLE/100)+1;
        
        System.out.print("Operador para calcular el IVA: ");
        System.out.println(IVA_DOUBLE);
        System.out.println("Precio con IVA de la remera: " + remera * operador_IVA);
        System.out.println("Precio con IVA del pantalon: " + pantalon * operador_IVA);
        System.out.println("Precio con IVA de la campera: " + campera * operador_IVA);
    }
}