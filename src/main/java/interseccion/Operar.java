package interseccion;

public class Operar {


   private int [] aux1;
    public void intereccion(int[] ar1, int[] ar2){
        aux1 = new int[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1.length; j++) {
               if (ar1[i] == ar2[j]){
                   aux1[i] = ar1[i];
               }
            }
        }

    }
}
