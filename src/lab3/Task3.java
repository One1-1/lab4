package lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Числа, которые делятся на все свои цифры:");
        
        for (int num = 1; num <= n; num++) {
            if (check(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    static boolean check(int number) {
        int current = number;
        
        while (current > 0) {
            int digit = current % 10;
            
            if (digit == 0) {
                return false;
            }
            
            if (number % digit != 0) {
                return false; 
            }
            
            current /= 10;
        }
        
        return true;
    
    }

}
