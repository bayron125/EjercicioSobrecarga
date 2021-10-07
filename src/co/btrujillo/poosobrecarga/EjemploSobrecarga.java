package co.btrujillo.poosobrecarga;
import static co.btrujillo.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Método con argumentos enteros: "+Calculadora.sumar(10,57));
        System.out.println("Método con argumentos flotantes: "+ Calculadora.sumar(11.2f,32.4f));
        System.out.println("Método con argumentos tipo String: "+ sumar("45","32"));
        System.out.println("Método con argumentos float- int: "+ sumar(10, 5.09f));
        System.out.println("Método con argumentos double: "+ sumar(2.3452,4.453));
        System.out.println("Método con 3 argumentos: "+sumar(5,65,12));
        System.out.println("Metodo con argumento float e Int "+ sumar(5.7f,7));

        System.out.println("Sumando long: "+sumar(10l,34l));
        System.out.println("Sumando caracteres: "+ sumar(60,'@'));
        System.out.println(" Sumando con Varags: "+ sumar(10,20,30,40));
    }
}
