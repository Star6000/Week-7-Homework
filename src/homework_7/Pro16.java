/*Write a Java program which input any number between 1 to 7 and it print The Daysname
        MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
        number is out of selection Print message “Week contains 1 to 7 days”*/
package homework_7;

import java.util.Scanner;

public class Pro16 {
    public static void main(String[] args) {
week();

    }
    public static void week(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7: ");

        String num = sc.next();

        switch (num
        ){
            case "1":
                System.out.println("Sunday");
                break;
            case "2":
                System.out.println("Monday");
                break;
            case "3" :
                System.out.println("Tuesday");
                break;
            case "4" :
                System.out.println("Wednesday");
                break;
            case "5" :
                System.out.println("Thursday");
                break;
            case "6" :
                System.out.println("Friday");
                break;
            case "7" :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("“Week contains 1 to 7 days”");
        }
    }

    }



