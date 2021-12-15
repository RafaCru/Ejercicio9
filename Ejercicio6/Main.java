package EjercicioSesión789.Ejercicio6;
/*Crea un ArrayLi de tipo int, y utilizando un bucle relleno con elementos 1...10
*a continuación, con otro bucle, recorre lo y elimina los pares. Por último vuelve a recorrerlo
* y muestra el Array List final. Si te atreves puedes hacerlo en menos pasos siempre y cuando cumplas
*  el primer for de relleno
* */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> lista= new ArrayList<>();
        for (int i =0; i<10; i++){
            lista.add(i+1);
            System.out.print(lista.get(i)+ "  ");
        }
        System.out.println(lista.size());
        for (int i=0;i < lista.size();i++){
            System.out.println(lista.get(i));

            if (lista.get(i) % 2==0){
                lista.remove(i);
           }

        }
        System.out.println();
        for (int j : lista){
        System.out.print(j+ "  ");
        }

    }
}
