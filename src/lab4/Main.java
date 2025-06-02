package lab4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1. Лаб.2, задание 1");
            System.out.println("2. Лаб.2, задание 2");
            System.out.println("3. Лаб.2, задание 3");
            System.out.println("4. Лаб.2, задание 4");
            System.out.println("5. Лаб.3, задание 1");
            System.out.println("6. Лаб.3, задание 2");
            System.out.println("7. Лаб.3, задание 3 (нерекурсивный)");
            System.out.println("8. Лаб.3, задание 3 (рекурсивный)");
            System.out.println("0. Выход");
            System.out.print("Выберите задание: ");
            
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    double[] result1 = MyClass.task1_lab2(scanner);
                    System.out.println("Среднее геометрическое: " + result1[0]);
                    System.out.println("Дробная часть: " + result1[1]);
                    break;
                case 2:
                    boolean result2 = MyClass.task2_lab2(scanner);
                    System.out.println("isSpecial = " + result2);
                    break;
                case 3:
                    double result3 = MyClass.task3_lab2(scanner);
                    System.out.println("y = " + result3);
                    break;
                case 4:
                    double[] result4 = MyClass.task4_lab2(scanner);
                    if (result4 != null) {
                        System.out.printf("Накрутка: %.2f%%\n", result4[0]);
                        System.out.printf("Итог: %.2f\n", result4[1]);
                    }
                    break;
                case 5:
                    String result5 = MyClass.task1_lab3(scanner);
                    System.out.println(result5);
                    break;
                case 6:
                    int result6 = MyClass.task2_lab3(scanner);
                    System.out.println("Количество: " + result6);
                    break;
                case 7:
                    List<Integer> result7 = MyClass.task3_lab3_nonRecursive(scanner);
                    System.out.println("Результат (нерекурсивный):");
                    for (int num : result7) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    List<Integer> result8 = MyClass.task3_lab3_recursive(scanner);
                    System.out.println("Результат (рекурсивный):");
                    for (int num : result8) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Завершение работы");
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        } while (choice != 0);
        scanner.close();
    }
}
