/*Same as above program-8 using switch statement.*/
package homework_7;

import java.util.Scanner;

public class Pro12 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  any Capital Alphabet : ");
            String city = sc.next();
            switch (city){
                case "A":
                    System.out.println("Ahemdabad");
                    break;
                case "B":
                    System.out.println("Banglore");
                    break;
                case "C" :
                    System.out.println("Chennai");
                    break;
                case "D" :
                    System.out.println("Delhi");
                    break;
                case "E" :
                    System.out.println("Elk");
                    break;
                case "F" :
                    System.out.println("Fiji");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }