package EjercicioSesión789.Ejercicio9.Entities;

import EjercicioSesión789.Ejercicio9.Interfaces.ClienteCRUD;
import EjercicioSesión789.Ejercicio9.Interfaces.ElectrodomesticoCRUD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Aviso implements ClienteCRUD, ElectrodomesticoCRUD {
    List<Cliente> clientes=new ArrayList<>();
    List<Electrodomestico> electrodomesticos=new ArrayList<>();
    int num_aviso;
    Cliente datocliente;
    Electrodomestico datoelectro;
    String sintoma;
    String averia;
    Map<Integer, String> materialutil =new HashMap<>();
    boolean finalizado;

    public Aviso() {
    }

    public Aviso(int num_aviso, Cliente datocliente, Electrodomestico datoelectro,
                 String sintoma, String averia, Map<Integer, String> materialutil, boolean finalizado) {
        this.num_aviso = num_aviso;
        this.datocliente = datocliente;
        this.datoelectro = datoelectro;
        this.sintoma = sintoma;
        this.averia = averia;
        this.materialutil = materialutil;
        this.finalizado=finalizado;
    }

    public int getNum_aviso() {
        return num_aviso;
    }

    public void setNum_aviso(int num_aviso) {
        this.num_aviso = num_aviso;
    }

    public Cliente getDatocliente() {
        return datocliente;
    }

    public void setDatocliente(Cliente datocliente) {
        this.datocliente = datocliente;
    }

    public Electrodomestico getDatoelectro() {
        return datoelectro;
    }

    public void setDatoelectro(Electrodomestico datoelectro) {
        this.datoelectro = datoelectro;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public Map<Integer, String> getMaterialutil() {
        return materialutil;
    }

    public void setMaterialutil(Map<Integer, String> materialutil) {
        this.materialutil = materialutil;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    @Override
    public String toString() {
        return "Aviso{" +
                "num_aviso=" + num_aviso +
                ", datocliente=" + datocliente +
                ", datoelectro=" + datoelectro +
                ", sintoma='" + sintoma + '\'' +
                ", averia='" + averia + '\'' +
                ", materialutil=" + materialutil +
                '}';
    }

    @Override
    public void nuevo(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente encuentraPorTel(int tel) {
        for (int i=0;i<clientes.size();i++){
            if ((clientes.get(i).telefono1==tel)||(clientes.get(i).telefono2==tel)){
                return datocliente;
            }
        }
        return null;
    }

    @Override
    public void elimina(int tel) {
        for (int i=0;i<clientes.size();i++){
            if ((clientes.get(i).telefono1==tel)||(clientes.get(i).telefono2==tel)){
                clientes.remove(i);
            }
        }
    }

    @Override
    public void actualiza(Cliente cliente) {
        boolean encontrado=false;
        for (int i=0;i<clientes.size();i++){
            if (clientes.get(i).cod_cliente== cliente.cod_cliente){
                encontrado=true;
                clientes.add(i,cliente);
            }
        }
        if (!encontrado){
            System.out.println("Cliente no encontrado");
        }
    }

    @Override
    public void nuevo(Electrodomestico electrodomestico) {
        electrodomesticos.add(electrodomestico);
    }

    @Override
    public Electrodomestico encuentraPorNumSerie(String numeroSerie) {
        for (int i=0;i<electrodomesticos.size();i++){
            if (electrodomesticos.get(i).numserie==numeroSerie){
                return datoelectro;
            }
        }
        return null;
    }

    @Override
    public void elimina(String numeroSerie) {
        for (int i=0;i<electrodomesticos.size();i++){
            if (electrodomesticos.get(i).numserie==numeroSerie){
                electrodomesticos.remove(i);
            }
        }

    }

    @Override
    public void actualiza(Electrodomestico electrodomestico) {
        boolean encontrado=false;
        for (int i=0;i<electrodomesticos.size();i++){
            if (electrodomesticos.get(i).numserie== electrodomestico.numserie){
                encontrado=true;
                electrodomesticos.add(i,electrodomestico);
            }
        }
        if (!encontrado){
            System.out.println("Electrodomestico no encontrado");
        }
    }
}
