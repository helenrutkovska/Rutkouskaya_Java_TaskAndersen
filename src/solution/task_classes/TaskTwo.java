package solution.task_classes;

import java.util.Scanner;

import static solution.utils.TextNotifications.*;

public class TaskTwo {
    public static void task2() {
        Scanner scName = new Scanner(System.in);
        System.out.println(taskTwoUserInputName);
        String name = scName.nextLine();

        if (name.equals(sampleName)) {
            System.out.println(sampleNameHello);
        } else {
            System.out.println(noName);
        }
    }
}
