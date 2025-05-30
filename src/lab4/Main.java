package lab4;

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
                case 1: MyClass.task1_lab2(scanner); break;
                case 2: MyClass.task2_lab2(scanner); break;
                case 3: MyClass.task3_lab2(scanner); break;
                case 4: MyClass.task4_lab2(scanner); break;
                case 5: MyClass.task1_lab3(scanner); break;
                case 6: MyClass.task2_lab3(scanner); break;
                case 7: MyClass.task3_lab3_nonRecursive(scanner); break;
                case 8: MyClass.task3_lab3_recursive(scanner); break;
                case 0: System.out.println("Завершение работы"); break;
                default: System.out.println("Неверный выбор!");
            }
        } while (choice != 0);
        scanner.close();
    }
}