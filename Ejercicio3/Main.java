package EjercicioSesión789.Ejercicio3;
/*Crea un array bidimensional de enteror y recorrelo
mostrando la posicion y el valor de cada elemento en ambas
dimensiones
* */
public class Main {
    public static void main(String[] args) {
    int arrayBidimensional[][] =new int[2][5];
    arrayBidimensional[0][0]= 50;
    arrayBidimensional[0][1]= 40;
    arrayBidimensional[0][2]= 30;
    arrayBidimensional[0][3]= 20;
    arrayBidimensional[0][4]= 10;
    arrayBidimensional[1][0]= 500;
    arrayBidimensional[1][1]= 400;
    arrayBidimensional[1][2]= 300;
    arrayBidimensional[1][3]= 200;
    arrayBidimensional[1][4]= 100;
    for (int i=0; i< arrayBidimensional.length;i++){
        for (int j=0; j< arrayBidimensional[i].length;j++)
        System.out.println("En la posicion [" + i +"] ["+ j + " ] tenemos el valor:" + arrayBidimensional[i][j]);
    }
    }
}
