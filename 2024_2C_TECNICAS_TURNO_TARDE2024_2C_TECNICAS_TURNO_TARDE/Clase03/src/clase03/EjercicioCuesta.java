/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase03;

/**
 *
 * @author Alumno
 */
public class EjercicioCuesta {

    public static void main(String[] args) {
        String palabra1 = "uesta";
        String palabra2 = "subir";
        String palabra3 = "la";
        String palabra4 = "a";
        String palabra5 = "e";
        String palabra6 = "l";
        String palabra7 = "v";
        String palabra8 = "s";
        String palabra9 = "n";
        String palabra10 = "c";
        String palabra11 = "d";
        String palabra12 = "y";
        String palabra13 = "medio";

        // “A Cuesta le cuesta subir la cuesta y en medio de la cuesta, va y se acuesta”.
        // A Cuesta
        String frase1 = palabra4.toUpperCase() + " " + palabra10.toUpperCase() + palabra1;
        // le cuesta subir la cuesta
        String frase2 = palabra6 + palabra5 + " " + palabra10 + palabra1 + " " + palabra2 + " " + palabra3 + " " + palabra10 + palabra1;
        // y en medio de la cuesta    
        String frase3 = palabra12 + " " + palabra5 + palabra9 + " " + palabra13 + " " + palabra11 + palabra5 + " " + palabra6 + palabra4 + " " + palabra10 + palabra1;
        // va y se acuesta
        String frase4 = palabra7 + palabra4 + " " + palabra12 + " " + palabra8 + palabra5 + " " + palabra4 + palabra10 + palabra1;

        System.out.println(frase1 + " " + frase2 + " " + frase3 + ", " + frase4);
    }

}
