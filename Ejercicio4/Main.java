package EjercicioSesión789.Ejercicio4;
/*Crea un Vector del tipo de dato que prefieras y añade le 5 elementos.
*Elimina el 2º y el 3º elemento y muestra el resultado final
* */
import java.util.Vector;

public class Main {
    public static void main (String [] arg){
        Vector <String> vectorString =new Vector();
        vectorString.add("hola");
        vectorString.add("mundo");
        vectorString.add("esto");
        vectorString.add("son");
        vectorString.add("vectores");
        for (String i:vectorString)
            System.out.print(i + " ");
            System.out.println();
        vectorString.remove("mundo");
        vectorString.remove("esto");
        for (String i:vectorString)
            System.out.print(i + " ");

    }


}
