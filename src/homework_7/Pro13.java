/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)*/
package homework_7;

import java.util.Scanner;

public class Pro13 {
    public static void main(String[] args){
        h();}

        public static void h(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any one number : ");
            double a = sc.nextInt();
            System.out.println("Enter second number : ");
            double b = sc.nextInt();
            System.out.println("Enter any Symbol : "); //+,-,/,*//
            String c = sc.next();
            if (c.equals("+")){
                System.out.println("addition = "+ (a+b));
            }
            else if(c.equals("-")){
                System.out.println("Subtraction = "+ (a-b));
            }
            else if(c.equals("/")){
                System.out.println("Division= "+ (a/b));}
            else if(c.equals("*")){
                System.out.println("Multiplication= "+ (a*b));}


            else {
                System.out.println("Invalid entry");
            }
        }




        }






