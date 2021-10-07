package co.btrujillo.poosobrecarga;

public class Calculadora {
    static int sumar(int a, int b){
        return a+b;
    }
    public static int sumar ( int ... argumentos){
      int suma=0;
       for(int a: argumentos){
           suma+=a;
       }
        return suma;
    }
    public static float  sumar (float  a, float b){
        return (a+b);
    }

    public static float sumar (float a, int b){
        return a+b;
    }

    public static float sumar (int a, float b){
        return a+b;
    }
    public static double sumar (double a, double b){
        return a+b;
    }
    public static int sumar (String a, String b){
       int resultado;
       try {
           resultado= Integer.parseInt(a) + Integer.parseInt(b);
       }catch (NumberFormatException e){
           resultado = 0;
       }

        return resultado;
    }
    static int   sumar(int a , int b,int c){
        return a+b+c;
    }
}
