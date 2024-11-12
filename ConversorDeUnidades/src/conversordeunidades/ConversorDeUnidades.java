package conversordeunidades;

import java.util.Scanner;

/**
 * La clase ConversorDeUnidades solicita ingresar por consola una cantidad
 * positiva y una unidad inform�tica de (desde bits hasta terabytes) y muestra
 * por pantalla la conversi�n en cada una de las unidades. Utiliza dos funciones
 * para obtener los datos de consola, una tercera funci�n para generar un vector
 * con los valores de unidades convertidos y un procedimiento para mostrar por
 * pantalla los valores del vector generado.
 *
 * @author Pablo Gularte
 */
public class ConversorDeUnidades {

    /**
     * M�todo principal de la clase.
     *
     * @param args Lista de par�metros recibidos por l�nea de comnado (si los
     * hubiera).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] valoresConvertidos;
        double valorAConvertir = obtenerValorAConvertir(teclado);
        int unidadOrigen = obtenerUnidadOrigen(teclado);
        valoresConvertidos = generarVectorValoresConvertidos(valorAConvertir, unidadOrigen);
        mostrarValoresEnPantalla(valoresConvertidos);
    }

    /**
     * Funci�n que solicita al usuario que ingrese por consola el valor que se
     * desea convertir. El valor a ingresar deve ser mayor que cero. Si se
     * ingresa un valor menor a cero la funci�n vuelve a solicitar el ingreso
     * hasta que se ingrese un valor positivo esperado.
     *
     * @param teclado Objeto que captura los ingresos por consola.
     * @return Devuelve el valor ingresado por consola.
     */
    public static double obtenerValorAConvertir(Scanner teclado) {
        double respuesta;
        System.out.println("****************************************************************");
        System.out.println("Le damos la bienvenida a este conversor de unidades inform�ticas");
        System.out.println("****************************************************************");
        System.out.println("Este conversor le permite ingresar un valor num�rico positivo");
        System.out.println("con su correspondiente unidad inform�tica de almacenamiento y le");
        System.out.println("muestra todas las correspondencias de valores en unidades que van");
        System.out.println("desde los bits hasta los terabytes.");
        System.out.println("A continuaci�n se le solicitar� ingresar los datos para realizar");
        System.out.println("las conversiones.\n");
        do {
            System.out.print("Ingrese un valor mayor a cero para convertir: ");
            respuesta = teclado.nextDouble();
        } while (respuesta <= 0);
        return respuesta;
    }

    /**
     * Funci�n que muestra un men� de opciones de unidades de almacenamiento
     * inform�tico para que el usuario seleccione la unidad desde la cual se
     * realizar� la conversi�n. Las opciones disponibles van desde el valor 1
     * para bits hasta el valor 6 para terabytes. Al devolver el valor de unidad
     * ingresado por consola la funci�n realiza una conversi�n del valor
     * rest�ndo una unidad para que pueda ser utilizado como �ndice de un vector
     * que contiene los factores de conversi�n de las cantidades.
     *
     * @param teclado Objeto que captura los ingresos por consola.
     * @return Devuelve un entero que es el n�mero anterior al mostrado por
     * pantalla para poder utilizarlo como �ndice en el vector de valores
     * convertidos.
     */
    public static int obtenerUnidadOrigen(Scanner teclado) {
        System.out.println("Seleccione del men� de opciones la unidad correspondiente al valor ingresado");
        System.out.println("1) Bits (b)\n"
                + "2) Bytes (B)\n"
                + "3) Kilobytes (KB)\n"
                + "4) Megabytes (MB)\n"
                + "5) Gigabytes (GB)\n"
                + "6) Terabytes (TB)");
        int respuesta;
        do {
            System.out.print("Ingrese la opci�n correspondiente a la unidad que desea: ");
            respuesta = teclado.nextInt();
        } while (respuesta < 1 || respuesta > 6);
        return respuesta - 1; // Devuelvo el d�gito ingresado por consola -1 para poder usarlo como �ndice de vector
    }

    /**
     * Procedimiento que recibe un valor y la unidad de almacenamiento
     * correspondiente y lo convierte a otras unidades de almacenamiento. Por
     * defecto, se convierte el valor a las siguientes unidades de
     * almacenamiento: bits, bytes, kilobytes, megabytes, gigabytes y terabytes.
     *
     * @param valor Es el valor que se desea convertir.
     * @param unidad Es la unidad de almacenamiento desde la cual se convertir�.
     * @return Devuelve el vector con los valores convertidos.
     */
    public static double[] generarVectorValoresConvertidos(double valor, int unidad) {
        double[] respuesta = new double[6];
        boolean pasarABits = true;
        // Convierto el valor ingresado por el usuario a bits y lo guardo en la
        // primera posici�n del vector a devolver como respuersta de la funci�n.
        respuesta[0] = convertirValor(valor, unidad, pasarABits);

        // Invoco la funcion convertirValor para rellenar el vector de valores convertidos
        // utilizando el indice del ciclo for para indicar la unidad hacia la que
        // se debe convertir el valor.
        // El ciclo for inicia en "1" porque la primera posici�n del vector ya
        // est� cargada. Env�a como primer argumento el valor ingresado por consola expresado
        // en bits, como segundo argumento el �ndice del ciclo for y como tercer argumento
        // un valor booleano en FALSE para explicitar que la conversi�n se realizar� desde bytes
        // hasta terabytes.
        for (int i = 1; i < respuesta.length; i++) {
            respuesta[i] = convertirValor(respuesta[0], i, !pasarABits);
        }
        return respuesta;
    }

    /**
     * Procedimiento que muestra por pantalla los valores convertidos. El
     * procedimeinto recibe un vector de tipo DOUBLE con los valores convertidos
     * y lo recorre para mostra los datos.
     *
     * @param valoresConvertidos Es el vector de valores convertidos a mostarr
     * por pantalla
     */
    public static void mostrarValoresEnPantalla(double[] valoresConvertidos) {
        String[] unidades = {"b", "B", "KB", "MB", "GB", "TB"};
        String[] etiquetaUnidades = {"Bits", "Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes"};

        System.out.println("\n*********************");
        System.out.println("Conversor de unidades");
        System.out.println("*********************");
        System.out.println("La cantidad ingresada se corresponde con los siguientes valores en las diferentes unidades:\n");
        for (int i = 0; i < valoresConvertidos.length; i++) {
            System.out.println(" * " + etiquetaUnidades[i] + ": " + valoresConvertidos[i] + " " + unidades[i]);
        }
    }

    /**
     * Funci�n que realiza la conversi�n de los valores de unidades. Realiza
     * conversiones hacia bits para utilizar el valor en bits como base para las
     * conversiones a las otras unidades. Las conversiones se realizan a partir
     * de un vector de factores de conversi�n y un valor boooleano que determina
     * si se debe realizar una multiplicaci�n o una divisi�n para obtener el
     * valor convertido.
     *
     * @param valor Es el valor ingresado por consola desde el cual se realizar�
     * la conversi�n.
     * @param unidad Es la unidad desde la cual se parte a hacer la conversi�n.
     * @param convertirABits Este valor explicita si el par�metro "valor" debe
     * ser convertido a bits o si se realizar� la conversi�n desde "valor" ya
     * expresado en bits.
     * @return Devuelve el valor de unidad convertido.
     */
    public static double convertirValor(double valor, int unidad, boolean convertirABits) {
        // Devuelvo el valor pasado por par�metro convertido a la unidad destino
        // utilizando un vector de factores de conversi�n. Si la conversi�n a realizar es hacia
        // bits, se utilizan los factores en una multiplicaci�n. Si la conversi�n es desde bits
        // se utilizan los factores como denominadores de una divisi�n.
        // Se utiliza el par�metro "unidad" para decidir cu�l es el factor de conversi�n a utilizar.
        double respuesta;
        double[] factoresDeConversion = {1, 8, 8 * 1024, 8 * Math.pow(1024, 2), 8 * Math.pow(1024, 3), 8 * Math.pow(1024, 4)};
        if (convertirABits) {
            respuesta = valor * factoresDeConversion[unidad];
        } else {
            respuesta = valor / factoresDeConversion[unidad];
        }
        return respuesta;
    }
}
