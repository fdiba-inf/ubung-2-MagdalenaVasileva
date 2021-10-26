package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a: ");
    double a = input.nextDouble();
    System.out.println("Enter b: ");
    double b = input.nextDouble();
    System.out.println("Enter c: ");
    double c = input.nextDouble();

    if (a != 0) {
      double discriminant = b * b - 4 * a * c;
      if (discriminant >= 0) {
        double squareRoot = Math.sqrt(discriminant);
        double x1 = (-b + squareRoot) / (2 * a);
        double x2 = (-b - squareRoot) / (2 * a);
        System.out.println(x1 + ", " + x2);
      } else {
        System.out.println("Imaginary values");
      }
    } else if (b != 0 ) {
      double x = -c / b;
      System.out.println(x);
    } else if (c != 0) {
      System.out.println("No values");
    } else {
      System.out.println("Many values");
    }
    }
  }
