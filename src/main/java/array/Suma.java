package array;


// git branch operacionesMejoradas
// git checkout operacionesMejoradas
// git checkout -b operacionesMejoradas
// git stash
//main -------------------------------------------
//miNuevaRama -------------------------------------------------------------------------------------------------

public class Suma {
    public static String sumar(int[] arr1){
        int res = 0;
        for (int i = 0; i < arr1.length ; i++) {
            res+=arr1[i];
        }
        return String.valueOf(res);
    }



    public static String sumar(char[] arr1){
        char res = 0;
        for (int i = 0; i < arr1.length ; i++) {
            res+=arr1[i];
        }
        return String.valueOf(res);
    }







    public static String sumar(double[] arr1){
        double res = 0;
        for (int i = 0; i < arr1.length ; i++) {
            res+=arr1[i];
        }
        return String.valueOf(res);
    }

    public static String sumar(String[] arr1){
        Integer res = 0;
        for (int i = 0; i < arr1.length ; i++) {
             res+=Integer.parseInt(arr1[i]);
        }
        return String.valueOf(res);
    }
}
