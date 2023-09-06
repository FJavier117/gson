package main;

import com.google.gson.Gson;
import gson.GsonEjemplo;
import model.Vacante;

public class Main {
    public static void main(String[] args) {
        GsonEjemplo gsonEjemplo = new GsonEjemplo(new Gson());
        System.out.println(gsonEjemplo.leerJson());
        gsonEjemplo.crearJson(new Vacante(1,"","","",887722.0,1));
    }

}

