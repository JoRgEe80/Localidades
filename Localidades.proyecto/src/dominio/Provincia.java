package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private List<Municipio> municipios;

    public Provincia() {
        this.municipios = new ArrayList<>();
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return totalHabitantes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Municipio municipio : municipios) {
            sb.append(municipio).append("\n");
        }
        return sb.toString();
    }
}
