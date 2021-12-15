package EjercicioSesión789.Ejercicio9.Entities;

public class Cliente {
    int cod_cliente;
    String nombre;
    String direccion;
    String cod_postal;
    String poblacion;
    int telefono1;
    int telefono2;

    public Cliente() {
    }

    public Cliente(int cod_cliente, String nombre, String direccion, String cod_postal,
                   String poblacion, int telefono1, int telefono2) {
        this.cod_cliente = cod_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cod_postal = cod_postal;
        this.poblacion = poblacion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }
}
