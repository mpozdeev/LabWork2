package training_center;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        CreateData.generate();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Выберете номер операции:\n" +
                    "1. Вывести студентов отсортированных по среднему баллу \n" +
                    "2. Вывести студентов отсортированных по оставшемуся времени \n" +
                    "3. Отфильтровать студентов по категории \"Имеет шанс на продолжение\" \n" +
                    "4. Вывести данные о состоянии студентов \n" +
                    "5. Выход \n" +
                    "> ");

            String[] params = reader.readLine().trim().toLowerCase().split(" ");
            if (params.length < 1 || params.length > 2) {
                System.out.println("Неверная команда.");
                System.out.println();
                continue;
            }

            switch (params[0]) {
                case "1": //"list students sorted by average mark":
                    System.out.println("Студенты отсортированны по среднему баллу:");
                    CreateData.listStudentsSortedByAvarageMarks();
                    break;
                case "2": //"list students sorted by time left":
                    System.out.println("Студенты отсортированны по оставшемуся времени:");
                    CreateData.listStudenstSortedByTimeLeft();
                    break;
                case "3": //"Filter students by category \"Have a chance\"":
                    System.out.println("Шанс есть у всех!");
                    break;
                case "4": //"List info about students":
                    System.out.println("Информация о состоянии студентов");
                    CreateData.listStatusStudents();
                    break;
                case "5": //"exit":
                    return;
                default:
                    System.out.println("Неверная команда.");
                    break;
            }
        }
    }
}