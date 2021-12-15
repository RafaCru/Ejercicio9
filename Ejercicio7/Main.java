package EjercicioSesión789.Ejercicio7;
/*Crea una funcion DividePorCero. esta debe generar una Excepcion ("trows")
* a su llamante del tipo ArithmeticException que sera capturada por su llamante
*(desde main por ejemplo). si se dispara la excepcion, mostraremos el mensaje
*"Esto no puede hacerse". Finalmente, mostraremos en cualquier caso "Demo de codigo"
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introduce el numerador:");
        int a=entrada.nextInt();
        int b=entrada.nextInt();

    try {
        int resultado= DividePorCero(a,b);
        System.out.println(resultado);
    }catch (ArithmeticException e){
            System.out.println("Error div por 0");
        }
    finally {
        System.out.println("Demo de codigo");
    }

    }
    public static int DividePorCero (int a, int b)throws ArithmeticException{
        return a/b;
    }
}
