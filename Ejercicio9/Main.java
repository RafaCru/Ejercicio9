package EjercicioSesión789.Ejercicio9;
/*
 * Sorpréndenos creando un programa de tu elección que utilice InputStream,
 *  PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 *
 *
 * */


import EjercicioSesión789.Ejercicio9.Entities.Aviso;
import EjercicioSesión789.Ejercicio9.Entities.Cliente;
import EjercicioSesión789.Ejercicio9.Entities.Electrodomestico;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static <date> void main (String[] args)throws IOException {
        int opcion=0;
        int contador=0;
        List<Aviso> avisos=new ArrayList<>();
        while (opcion!=7) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Selecciona un opción: " + "\n 1.- Crear aviso desde documento TXT"
                    + "\n 2.- Buscar aviso"
                    + "\n 3.- Listar todos los avisos"
                    + "\n 4.- Eliminar aviso por numero de aviso"
                    + "\n 5.- Actualiza un aviso"
                    + "\n 6.- Finalizar aviso"
                    + "\n 7.- Salir de la aplicación");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //Crear Aviso nuevo desde uhn fichero TXT

                    Cliente cliente = new Cliente();
                    Electrodomestico electrodomestico = new Electrodomestico();
                    String sintoma = "";
                    String Ubicacion = "c:\\entrada\\aviso.txt";

                    try {
                        //leemos un archivo TXT Formateado con los datos del cliente, electrodomestico y sintoma
                        InputStream fichero = new FileInputStream(Ubicacion);
                        BufferedReader br = new BufferedReader(new InputStreamReader(fichero));


                        cliente.setCod_cliente(Integer.parseInt(br.readLine()));
                        System.out.println(cliente.getCod_cliente());
                        cliente.setNombre(br.readLine());
                        System.out.println(cliente.getNombre());
                        cliente.setDireccion(br.readLine());
                        System.out.println(cliente.getDireccion());
                        cliente.setCod_postal(br.readLine());
                        System.out.println(cliente.getCod_postal());
                        cliente.setPoblacion(br.readLine());
                        System.out.println(cliente.getPoblacion());
                        cliente.setTelefono1(Integer.parseInt(br.readLine()));
                        System.out.println(cliente.getTelefono1());
                        cliente.setTelefono2(Integer.parseInt(br.readLine()));
                        System.out.println(cliente.getTelefono2());


                        electrodomestico.setMarca(br.readLine());
                        System.out.println(electrodomestico.getMarca());
                        electrodomestico.setModelo(br.readLine());
                        System.out.println(electrodomestico.getModelo());
                        electrodomestico.setElectrodomestico(br.readLine());
                        System.out.println(electrodomestico.getElectrodomestico());
                        electrodomestico.setCod_fabricante(br.readLine());
                        System.out.println(electrodomestico.getCod_fabricante());
                        electrodomestico.setNumserie(br.readLine());
                        System.out.println(electrodomestico.getNumserie());
                        electrodomestico.setFecha_compra(br.readLine());
                        sintoma = br.readLine();


                    } catch (Exception e) {
                        System.out.println("Error");
                    } finally {
                        Aviso aviso = new Aviso(contador, cliente, electrodomestico, sintoma, null, null, false);
                        avisos.add(aviso);
                        contador++;
                        break;
                    }
                case 2:
                    //Buscar un aviso
                case 3:
                    //listar todos los avisos

                    for (int i=0; i<avisos.size();i++){
                        System.out.println(avisos);


                    }
                case 4:
                    //Eliminar un aviso por Número de Aviso
                case 5:
                    //Actualizar un aviso
                case 6:
                    //Finalizar aviso, añadiendo materiales utilizados HasMap
                case 7:
                    //Finalizar aplicación
            }
        }
    }
}
