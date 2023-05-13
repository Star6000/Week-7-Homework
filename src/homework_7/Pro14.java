/*14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.*/
package homework_7;

public class Pro14 {
    public static void main(String[] args) {
h();

    }
    public static void h(){
        System.out.println("Number Divided by 3 : ");//Declare numbers divide by 3
        for(int i = 0;i<=100;i++)
            if (i%3==0){
                System.out.println(i);}

        System.out.println("Number Divided by 5 : ");//Declare numbers divide by 5
        for(int i = 0;i<=100;i++)
            if (i%5==0){
                System.out.println(i);}}
}
