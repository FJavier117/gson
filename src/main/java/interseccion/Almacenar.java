package interseccion;

public class Almacenar {
    private final int[] arr1;
    private final int size;
    private int i;

    public Almacenar(int size) {
        this.arr1 = new int[size];
        this.size = size;
        this.i = 0;
    }

    public void setArr1(int a) {
        if (i < size) {
            this.arr1[i] = a;
            i++;
        }
    }
    public int[] getArr1() {
        return arr1;
    }
    public int getSize() {
        return size;
    }
}
