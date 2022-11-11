package solution.task_classes;

import solution.utils.FillArray;

import java.util.ArrayList;

public class TaskThree {
    public static void task3() {
        //массив от 0 до 100
        int[] array = FillArray.fillArray(0, 100);
        ArrayList<Integer> multiplesOf3 = new ArrayList<>();
        for (int a : array) {
            if (a % 3 == 0) {
                multiplesOf3.add(a);
            }
        }
        System.out.println(multiplesOf3);
    }
}