package homework_7;

import java.util.Scanner;

/*Write a java program to get numbers from users and print whether it is positive or negative.*/
public class Pro8 {
    public static void main(String[] args) {
//To take input from the user
        //Create an object of scanner class
        Scanner sc = new Scanner(System.in);
        int a; //Declare a variable
        System.out.println("Enter a number to check positve or negative : ");
        a = sc.nextInt();

        if (a > 0) {
            System.out.println("The answer is in Positive");

        } else if (a <= 0) {
            System.out.println("The answer is in Negative");
        }
    }}
