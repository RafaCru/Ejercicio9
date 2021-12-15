package EjercicioSesión789.Ejercicio9.Interfaces;

import EjercicioSesión789.Ejercicio9.Entities.Electrodomestico;

public interface ElectrodomesticoCRUD {
    void nuevo (Electrodomestico electrodomestico);
    Electrodomestico encuentraPorNumSerie (String numeroSerie);
    void elimina (String numeroSerie);
    void actualiza (Electrodomestico electrodomestico);

}
