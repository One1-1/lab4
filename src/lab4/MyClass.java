package lab4;

import java.util.Scanner;

public class MyClass {
    // Лаб. работа 2, задание 1
    public static void task1_lab2(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        double geometricMean = Math.cbrt(num1 * num2 * num3);
        double fractionalPart = geometricMean - Math.floor(geometricMean);

        System.out.println("Среднее геометрическое: " + geometricMean);
        System.out.println("Дробная часть: " + fractionalPart);
    }

    // Лаб. работа 2, задание 2
    public static void task2_lab2(Scanner scanner) {
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        int integerPart = (int) x;
        double fractionalPart = x - integerPart;
        int tensDigit = (integerPart / 10) % 10;
        int fractionalTensDigit = (int) (fractionalPart * 100) % 10;

        boolean isSpecial = (tensDigit > 3) && (tensDigit <= 7) && (tensDigit > fractionalTensDigit);
        System.out.println("isSpecial = " + isSpecial);
    }

    // Лаб. работа 2, задание 3 
    public static void task3_lab2(Scanner scanner) {
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double a = 0.19, b = 6.1;
        double y;
        if (x <= -1) {
            y = Math.pow(e, Math.sin(x));  // используем e
        } else if (x > 5) {
            y = Math.pow(Math.log(Math.abs(b * x)), 2);
        } else {
            y = Math.sqrt(1 + Math.pow(a * x, 2));
        }
        System.out.println("y = " + y);
    }

    // Лаб. работа 2, задание 4
    public static void task4_lab2(Scanner scanner) {
        System.out.print("Тип операции (p/o/r/b): ");
        char opType = scanner.next().charAt(0);
        System.out.print("Начальная стоимость: ");
        double price = scanner.nextDouble();

        double markup;
        switch (opType) {
            case 'p': markup = 0; break;
            case 'o': markup = 5; break;
            case 'r': markup = 15; break;
            case 'b': markup = 7; break;
            default:
                System.out.println("Ошибка!");
                return;
        }

        double finalPrice = price * (1 + markup / 100);
        System.out.printf("Накрутка: %.2f%%\n", markup);
        System.out.printf("Итог: %.2f\n", finalPrice);
    }

    // Лаб. работа 3, задание 1
    public static void task1_lab3(Scanner scanner) {
        System.out.println("Введите числа (0 для окончания):");
        int first = scanner.nextInt();
        int min = first, max = first;
        int minIndex = 0, maxIndex = 0;
        int index = 0;

        int num;
        while ((num = scanner.nextInt()) != 0) {
            index++;
            if (num < min) {
                min = num;
                minIndex = index;
            }
            if (num > max) {
                max = num;
                maxIndex = index;
            }
        }

        System.out.println(minIndex <= maxIndex ? "min" : "max");
    }

    // Лаб. работа 3, задание 2
    public static void task2_lab3(Scanner scanner) {
        System.out.print("Начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Конец диапазона: ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int count = 0;
        for (int num = start; num <= end; num++) {
            if (num >= 100 && num <= 999) {
                int sum = (num / 100) + (num / 10 % 10) + (num % 10);
                if (isPrime(sum)) count++;
            }
        }
        System.out.println("Количество: " + count);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Лаб. работа 3, задание 3 (нерекурсивный)
    public static void task3_lab3_nonRecursive(Scanner scanner) {
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Результат (нерекурсивный):");
        for (int i = 1; i <= n; i++) {
            if (checkNonRecursive(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean checkNonRecursive(int num) {
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) return false;
            temp /= 10;
        }
        return true;
    }

    // Лаб. работа 3, задание 3 (рекурсивный)
    public static void task3_lab3_recursive(Scanner scanner) {
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Результат (рекурсивный):");
        for (int i = 1; i <= n; i++) {
            if (checkRecursive(i, i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean checkRecursive(int num, int original) {
        if (num == 0) return true;
        int digit = num % 10;
        if (digit == 0 || original % digit != 0) return false;
        return checkRecursive(num / 10, original);
    }
}