package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Sistem.out.print("Enter a number between 0 and 999: ");
    int number = input.nextInt();
    int firstDigit = number % 10;
    number = number / 10;
    int secondDigit = number % 10;
    number = number / 10;
    int thirdDigit = number % 10;
    int sum = firstDigit + secondDigit + thirdDigit;

    System.out.println("Sum of digits: " + sum);

  }
}