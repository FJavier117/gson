package interseccion;

import array.MiArray;
import array.Suma;

import java.util.Scanner;

public class Capturar {
    //Una instancia de la clase almacenar
    private Almacenar almacenar1;
    private Almacenar almacenar2;
    private Operar operar;
    public void iniciar() {
        solicitar();
        operar = new Operar();
        operar.intereccion(almacenar1.getArr1(),almacenar2.getArr1());
    }

    private void solicitar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del arreglo: ");
        int size = scanner.nextInt();
        almacenar1 = new Almacenar(size);
        almacenar2 = new Almacenar(size);
        llenar(almacenar1,scanner);
        llenar(almacenar2,scanner);
    }

    private void llenar(Almacenar almacenar, Scanner scanner){
        for (int i = 0; i < almacenar.getSize(); i++) {
            System.out.println("Ingresa valor: ");
            almacenar.setArr1(scanner.nextInt());
        }
    }

}
