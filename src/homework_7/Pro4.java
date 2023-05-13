/*Write if else condition and print your group name in console else others group name.*/
package homework_7;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        new Pro4().m1();

    }

    public void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter group name.");
        String groupname = sc.nextLine();
        String post = "Postman";
        String selenium = "Selenium";
        if (groupname.equals(post)) {
            System.out.println("Welcome to our Postman group.");
        } else if (groupname.equals(selenium)) ;
         System.out.println("hello Selenium group.");







