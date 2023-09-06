package array;

public class MiArray {
    private final int[] arr1;
    private final char[] arr2;
    private final double[] arr3;
    private final String[] arr4;
    private final int size;
    private int i;

    public MiArray(int size) {
        this.arr1 = new int[size];
        this.arr2 = new char[size];
        this.arr3 = new double[size];
        this.arr4 = new String[size];
        this.size = size;
        this.i = 0;
    }

    public int getSize() {
        return size;
    }

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int a) {
        if (i < size) {
            this.arr1[i] = a;
            i++;
        }
    }

    public char[] getArr2() {
        return arr2;
    }

    public void setArr2(char a) {
        if (i < size) {
            this.arr2[i] = a;
            i++;
        }
    }

    public double[] getArr3() {
        return arr3;
    }

    public void setArr3(double a) {
        if (i < size) {
            this.arr3[i] = a;
            i++;
        }
    }

    public String[] getArr4() {
        return arr4;
    }

    public void setArr4(String a) {
        if (i < size) {
            this.arr4[i] = a;
            i++;
        }
    }
}
