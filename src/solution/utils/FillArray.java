package solution.utils;

public class FillArray {
    public static int[] fillArray(int firstNumber, int lastNumber) {
        int[] arr100 = new int[lastNumber];
        for (int j = firstNumber; j < arr100.length; j++) {
            arr100[j] = j + 1;
            System.out.print(arr100[j]);
        }
        return arr100;
    }
}
