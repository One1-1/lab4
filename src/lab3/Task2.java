package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        
        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();
        
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        
        int count = 0; 
        
        
        for (int num = start; num <= end; num++) {
            if (num >= 100 && num <= 999) {
                int digit1 = num / 100;       
                int digit2 = (num / 10) % 10; 
                int digit3 = num % 10;
                
                int sum = digit1 + digit2 + digit3; 
                
                if (isPrime(sum)) {
                    count++;
                }
            }
        }
        
        System.out.println("Количество трехзначных чисел: " + count);
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; 
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
