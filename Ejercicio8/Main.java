package EjercicioSesión789.Ejercicio8;
/*Utilizando ImputStream y PrintStream, crea una función que reciba dos parámetros
*fileIn y fileOut. La tarea de la función será realizar la copia del fichero dado
* en el paramero fileIn al fichero dado en fileOut
* */
import java.io.*;

public class Main {
    public static  void main(String[] args) throws IOException {
      try {
          InputStream ficheroOrigen = new FileInputStream("c:\\texto.txt");
          OutputStream ficheroSalida =new FileOutputStream("textosalida.txt");

          copiarFichero(ficheroOrigen, ficheroSalida);

          InputStream FicheroNuevo =new FileInputStream("C:\\Users\\josep\\Documents\\papa\\Open BootCamp\\Java\\textosalida.txt");
          System.out.println();
          System.out.println();
          int temp;
          while ((temp=FicheroNuevo.read())!=-1) {
              System.out.print( (char) temp);
          }
      } catch(Exception e){
          System.out.println("el error" + e);
      }finally {
          System.out.println();
          System.out.println("Ha funcionado todo correcto");

          }


      }
      public static void copiarFichero (InputStream filein,OutputStream fileout)throws IOException{

        int temp;
        while ((temp=filein.read())!=-1){
            System.out.print((char) temp);
            fileout.write(temp);

        }

    }
    }


