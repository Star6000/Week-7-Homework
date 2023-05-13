/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
        other alphabet should be invalid entry.*/
package homework_7;

import java.util.Scanner;

public class Pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet :");
        String city = sc.next();
        if(city.equalsIgnoreCase("a")){
            System.out.println("Ahemdabad");
        } else if (city.equalsIgnoreCase("b")){
            System.out.println("Bhopal");}
        else if (city.equalsIgnoreCase("c")){
            System.out.println("Chennai");}
        else if (city.equalsIgnoreCase("d")){
            System.out.println("Delhi");}
        else if (city.equalsIgnoreCase("e")){
            System.out.println("Elk");}
        else if (city.equalsIgnoreCase("f")){
            System.out.println("Fiji");}
        else {
            System.out.println("invalid entry");
        }
    }
}


