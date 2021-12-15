package EjercicioSesión789.Ejercicio9.Entities;

import java.util.Date;


public class Electrodomestico {
    String marca;
    String modelo;
    String electrodomestico;
    String cod_fabricante;
    String numserie;
    String fecha_compra;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, String electrodomestico,
                            String cod_fabricante, String numserie, String fecha_compra) {
        this.marca = marca;
        this.modelo = modelo;
        this.electrodomestico = electrodomestico;
        this.cod_fabricante = cod_fabricante;
        this.numserie = numserie;
        this.fecha_compra = fecha_compra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(String electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public String getCod_fabricante() {
        return cod_fabricante;
    }

    public void setCod_fabricante(String cod_fabricante) {
        this.cod_fabricante = cod_fabricante;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
}
