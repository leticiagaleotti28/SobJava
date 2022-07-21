package Dio;

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double l1, double l2) {

        System.out.println("Área do retângulo: " + l1 * l2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do Trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float d1, float d2) {

        System.out.println("Área do losango: " + (d1 * d2) / 2);
    }
}
