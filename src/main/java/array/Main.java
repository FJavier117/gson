package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ch = new char[4];
        for (int i = 0; i < ch.length; i++) {
            System.out.println("elemento");
            ch[i] = scanner.next().charAt(0);

        }
        String resultado = sumar(ch);
        System.out.println("Resultado de sumar char [] mi = {'a','b','c'}: " + resultado);

    }

    public static String sumar(char[] arr1){
        int res = 0;
        for (int i = 0; i < arr1.length ; i++) {
            res+=arr1[i];
        }
        return String.valueOf(res);
    }

  /*  public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del arreglo: ");
        MiArray miArray = new MiArray(scanner.nextInt());

        for (int i = 0; i < miArray.getSize(); i++) {
            System.out.println("Ingresa valor: ");
            miArray.setArr1(scanner.nextInt());
        }
        System.out.println(Suma.sumar(miArray.getArr1()));
    }*/
}
