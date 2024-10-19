package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Localidad> localidades;

    public Municipio() {
        this.localidades = new ArrayList<>();
    }

    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return totalHabitantes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Localidad localidad : localidades) {
            sb.append(localidad).append("\n");
        }
        return sb.toString();
    }
}

