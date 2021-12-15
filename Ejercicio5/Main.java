package EjercicioSesión789.Ejercicio5;

/*Crea un ArrayList de tipo String con 4 eelementos copia a un linkedList
 *recorre ambos mostrando unicamente el valor de cada elemento
 * */
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main (String[] args){
        ArrayList<String> lista =new ArrayList<>();
        LinkedList<String> lista2=new LinkedList<>();
        lista.add("elemento uno");
        lista.add("elemento dos");
        lista.add("elemento tres");
        lista.add("elemento cuatro");
        for (String i :lista) {
            System.out.println("Elemento del Array List: " + i );
            lista2.add(i);
        }
        for (String i : lista2){
            System.out.println("Elemento del Linked List: " + i );
        }


    }
}
