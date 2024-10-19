package aplicacion;

import dominio.Localidad;

public class Principal {
    public static void main(String[] args) {
        Localidad localidad = new Localidad("Madrid", 3223000);
        System.out.println(localidad);
    }
}
