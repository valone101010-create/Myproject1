package by.itstep.lesson1;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вашу оценку за экзамен (от 0 до 100): ");
        int examGrade = scanner.nextInt();

        if (examGrade >= 90 && examGrade <= 100) {
            System.out.println("Отлично (A) - Ты гений!");
        } else if (examGrade >= 75 && examGrade <= 89) {
            System.out.println("Хорошо (B) - Молодец!");
        } else if (examGrade >= 60 && examGrade <= 74) {
            System.out.println("Удовлетворительно (C) - Можно лучше");
        } else if (examGrade >= 40 && examGrade <= 59) {
            System.out.println("Плохо (D) - Нужно подтянуть");
        } else if (examGrade >= 0 && examGrade <= 39) {
            System.out.println("Неудовлетворительно (F) - Учи материал!");
        } else {
            System.out.println("Ошибка! Введите число от 0 до 100");
        }

        scanner.close();
    }
}
