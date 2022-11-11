package solution.task_classes;

import java.util.Scanner;

import static solution.utils.TextNotifications.*;

public class TaskOneInput {
    public static void task1Input() {
        //число получаем путем ввода в консоль
        Scanner sc = new Scanner(System.in);
        System.out.println(userInput);
        int value = sc.nextInt();
        if (value > 7) {
            System.out.println(hello);
        } else {
            System.out.println(taskOneNumberLessEqual);
        }
    }
}