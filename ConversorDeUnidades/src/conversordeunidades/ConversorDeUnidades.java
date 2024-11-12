package conversordeunidades;

import java.util.Scanner;

/**
 * La clase ConversorDeUnidades solicita ingresar por consola una cantidad
 * positiva y una unidad informática de (desde bits hasta terabytes) y muestra
 * por pantalla la conversión en cada una de las unidades. Utiliza dos funciones
 * para obtener los datos de consola, una tercera función para generar un vector
 * con los valores de unidades convertidos y un procedimiento para mostrar por
 * pantalla los valores del vector generado.
 *
 * @author Pablo Gularte
 */
public class ConversorDeUnidades {

    /**
     * Método principal de la clase.
     *
     * @param args Lista de parámetros recibidos por línea de comnado (si los
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
     * Función que solicita al usuario que ingrese por consola el valor que se
     * desea convertir. El valor a ingresar deve ser mayor que cero. Si se
     * ingresa un valor menor a cero la función vuelve a solicitar el ingreso
     * hasta que se ingrese un valor positivo esperado.
     *
     * @param teclado Objeto que captura los ingresos por consola.
     * @return Devuelve el valor ingresado por consola.
     */
    public static double obtenerValorAConvertir(Scanner teclado) {
        double respuesta;
        System.out.println("****************************************************************");
        System.out.println("Le damos la bienvenida a este conversor de unidades informáticas");
        System.out.println("****************************************************************");
        System.out.println("Este conversor le permite ingresar un valor numérico positivo");
        System.out.println("con su correspondiente unidad informática de almacenamiento y le");
        System.out.println("muestra todas las correspondencias de valores en unidades que van");
        System.out.println("desde los bits hasta los terabytes.");
        System.out.println("A continuación se le solicitará ingresar los datos para realizar");
        System.out.println("las conversiones.\n");
        do {
            System.out.print("Ingrese un valor mayor a cero para convertir: ");
            respuesta = teclado.nextDouble();
        } while (respuesta <= 0);
        return respuesta;
    }

    /**
     * Función que muestra un menú de opciones de unidades de almacenamiento
     * informático para que el usuario seleccione la unidad desde la cual se
     * realizará la conversión. Las opciones disponibles van desde el valor 1
     * para bits hasta el valor 6 para terabytes. Al devolver el valor de unidad
     * ingresado por consola la función realiza una conversión del valor
     * restándo una unidad para que pueda ser utilizado como índice de un vector
     * que contiene los factores de conversión de las cantidades.
     *
     * @param teclado Objeto que captura los ingresos por consola.
     * @return Devuelve un entero que es el número anterior al mostrado por
     * pantalla para poder utilizarlo como índice en el vector de valores
     * convertidos.
     */
    public static int obtenerUnidadOrigen(Scanner teclado) {
        System.out.println("Seleccione del menú de opciones la unidad correspondiente al valor ingresado");
        System.out.println("1) Bits (b)\n"
                + "2) Bytes (B)\n"
                + "3) Kilobytes (KB)\n"
                + "4) Megabytes (MB)\n"
                + "5) Gigabytes (GB)\n"
                + "6) Terabytes (TB)");
        int respuesta;
        do {
            System.out.print("Ingrese la opción correspondiente a la unidad que desea: ");
            respuesta = teclado.nextInt();
        } while (respuesta < 1 || respuesta > 6);
        return respuesta - 1; // Devuelvo el dígito ingresado por consola -1 para poder usarlo como índice de vector
    }

    /**
     * Procedimiento que recibe un valor y la unidad de almacenamiento
     * correspondiente y lo convierte a otras unidades de almacenamiento. Por
     * defecto, se convierte el valor a las siguientes unidades de
     * almacenamiento: bits, bytes, kilobytes, megabytes, gigabytes y terabytes.
     *
     * @param valor Es el valor que se desea convertir.
     * @param unidad Es la unidad de almacenamiento desde la cual se convertirá.
     * @return Devuelve el vector con los valores convertidos.
     */
    public static double[] generarVectorValoresConvertidos(double valor, int unidad) {
        double[] respuesta = new double[6];
        boolean pasarABits = true;
        // Convierto el valor ingresado por el usuario a bits y lo guardo en la
        // primera posición del vector a devolver como respuersta de la función.
        respuesta[0] = convertirValor(valor, unidad, pasarABits);

        // Invoco la funcion convertirValor para rellenar el vector de valores convertidos
        // utilizando el indice del ciclo for para indicar la unidad hacia la que
        // se debe convertir el valor.
        // El ciclo for inicia en "1" porque la primera posición del vector ya
        // está cargada. Envía como primer argumento el valor ingresado por consola expresado
        // en bits, como segundo argumento el índice del ciclo for y como tercer argumento
        // un valor booleano en FALSE para explicitar que la conversión se realizará desde bytes
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
     * Función que realiza la conversión de los valores de unidades. Realiza
     * conversiones hacia bits para utilizar el valor en bits como base para las
     * conversiones a las otras unidades. Las conversiones se realizan a partir
     * de un vector de factores de conversión y un valor boooleano que determina
     * si se debe realizar una multiplicación o una división para obtener el
     * valor convertido.
     *
     * @param valor Es el valor ingresado por consola desde el cual se realizará
     * la conversión.
     * @param unidad Es la unidad desde la cual se parte a hacer la conversión.
     * @param convertirABits Este valor explicita si el parámetro "valor" debe
     * ser convertido a bits o si se realizará la conversión desde "valor" ya
     * expresado en bits.
     * @return Devuelve el valor de unidad convertido.
     */
    public static double convertirValor(double valor, int unidad, boolean convertirABits) {
        // Devuelvo el valor pasado por parámetro convertido a la unidad destino
        // utilizando un vector de factores de conversión. Si la conversión a realizar es hacia
        // bits, se utilizan los factores en una multiplicación. Si la conversión es desde bits
        // se utilizan los factores como denominadores de una división.
        // Se utiliza el parámetro "unidad" para decidir cuál es el factor de conversión a utilizar.
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
