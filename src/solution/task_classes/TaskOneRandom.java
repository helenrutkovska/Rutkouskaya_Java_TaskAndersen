package solution.task_classes;

import solution.utils.RandomNumber;

import static solution.utils.TextNotifications.*;

public class TaskOneRandom {
    public static void task1Random() {
        //введенное число получаем рандомно
        int number = RandomNumber.randomNumber(0,1000);
        System.out.println(taskOneRandomNumber + number);
        if (number > 7) {
            System.out.println(hello);
        } else {
            System.out.println(taskOneNumberLessEqual);
        }
    }
}