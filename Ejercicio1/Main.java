package EjercicioSesión789.Ejercicio1;
/*1 Dada la funcion:
* public static String reverse(String texto){
* }
* Escribe el codigo que devuelva una cadena al reves.
* Por ejemplo:
* "Hola mundo"
* debe retornar "odnum aloh"*/
public class Main {
    public static void main(String[] args) {
        String texto="hola mundo cruel";
        reverse(texto);

    }
    public  static void reverse(String texto) {
        for (int i = texto.length() - 1; i >= 0; i--)
            System.out.print(texto.charAt(i));

    }
}
