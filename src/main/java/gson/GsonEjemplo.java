package gson;

import com.google.gson.Gson;
import model.Vacante;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

public class GsonEjemplo {
    Gson data;
    String archivo = " ";
    public GsonEjemplo(Gson data){
        this.data = data;
    }
    public Vacante leerJson(){
        try{
            /*
                Esta clase lee texto desde un
                flujo de entrada de caracteres,
                almacenando los caracteres para
                proporcionar una lectura eficiente de caracteres, arreglos y líneas.
             */
            FileReader fileReader = new FileReader("C:\\Users\\mende\\IdeaProjects\\cjava\\coleccionHasMap\\src\\main\\resources\\db.json");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String row;
            while ((row = bufferedReader.readLine()) != null){
                archivo += row;
            }

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return data.fromJson(archivo,Vacante.class);
    }


    public void crearJson(Vacante vacante){
        guardar(data.toJson(vacante));
    }

    private void guardar(String data){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos_vacante.json"))) {
            bw.write(data);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
