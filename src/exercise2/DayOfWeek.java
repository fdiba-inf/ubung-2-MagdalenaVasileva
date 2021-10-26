package exercise2;

import java.util.Scanner;

public class DayOfWeek { 
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a day of week: ");
      int dayOfWeekNumber = input.nextInt();
       
      String dayOfWeek;
      if (dayOfWeekNumber == 1) {
        dayOfWeek = "Monday";
      }else if (dayOfWeekNumber == 2) {
           dayOfWeek = "Tuesday";
        }else if (dayOfWeekNumber == 3) {
             dayOfWeek = "Wednesday";
          }else if (dayOfWeekNumber == 4) {
             dayOfWeek = "Thursday";
        }else if (dayOfWeekNumber == 5) {
             dayOfWeek = "Friday";
      }else if (dayOfWeekNumber == 6) {
             dayOfWeek = "Saturday";
          }else if (dayOfWeekNumber == 7) {
             dayOfWeek = "Sunday";
          }else{
             dayOfWeek = "Invalid day"; 
          }

          System.out.println("Day of week: " + dayOfWeek);
}
}

    