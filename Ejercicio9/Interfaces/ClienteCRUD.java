package EjercicioSesión789.Ejercicio9.Interfaces;

import EjercicioSesión789.Ejercicio9.Entities.Cliente;
import EjercicioSesión789.Ejercicio9.Entities.Electrodomestico;

public interface ClienteCRUD {
    void nuevo (Cliente cliente);
    Cliente encuentraPorTel (int tel);
    void elimina (int tel);
    void actualiza (Cliente cliente);

}
