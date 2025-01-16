package org.example.utils;

public class ConversionNombre {

    public static void main(String[] args) {
        String chaine = "10";
        int nombre = Integer.parseInt(chaine);
        System.out.println(nombre);

        int a = 10;
        int b = 20;

        int max = Integer.max(a, b);
        System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);
    }
}
