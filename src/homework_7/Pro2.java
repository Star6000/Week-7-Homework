/*Declare array and store any 5 countries and print them in console.*/

package homework_7;

public class Pro2 {
    public static void main(String[] args){
        new Pro2().listofcountries();}
        public void listofcountries() { //instance method
            String countries[] = {"India","France","Poland","Switzerland","Japan"};//5 countries in array.
            System.out.println("list of 5 Countries");
            System.out.println("-------------------------------");
            for (int a = 0; a < 5; a++){
                System.out.println(countries[a]); //print list of countries using a loop
            }
        }
}




