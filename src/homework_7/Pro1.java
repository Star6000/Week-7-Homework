/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
package homework_7;

import java.util.Scanner;
public class Pro1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number and will divide by 2 : ");
            int num = sc.nextInt();
            if(num % 2 == 0)
                System.out.println("The answer is even");
            else
                System.out.println( " The answer is odd");
        }
    }



