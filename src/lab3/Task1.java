package lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
            
        int firstNumber = scanner.nextInt();

        int min = firstNumber;
        int max = firstNumber;
        int minIndex = 0;
        int maxIndex = 0;
        int index = 0;

        int number;
        while ((number = scanner.nextInt()) != 0) {
            index++;

            if (number < min) {
                min = number;
                minIndex = index;
            }

            if (number > max) {
                max = number;
                maxIndex = index;
            }
        }
        
        if (minIndex <= maxIndex) {
            System.out.println("min");
        } else {
            System.out.println("max");
        }
        
        scanner.close();
        }
    }

