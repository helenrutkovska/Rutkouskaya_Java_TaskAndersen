package solution.utils;

public class RandomNumber {

    public static int randomNumber(int min, int max) {
        int number = (int) (Math.random() * (max - min + 1) + min);
        return number;
    }
}