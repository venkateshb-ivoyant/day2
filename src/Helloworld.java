import  java.util.Scanner;
public class Helloworld {
    public static void main(String[] args) {
       int i=10;
       int j=20;
      System.out.println(i+j);
     float k=3.14f;
       double price =100.00;
        String name = "Venkatesh ";
        String lname= "B S";
        String fullname = name+lname;
        System.out.println(fullname);
        System.out.println(name+lname);
        System.out.println(name);
        System.out.println(" Hi "+ name +" welcome to iVoyant");

        System.out.println(price);
        System.out.println(k);
        System.out.println("This hello world program");
        /*You always tip 15% of the bill amount.

                To make the calculation easier, you decide to write a program that will do that for you.

                Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.

        To calculate 15% of a number, multiply it by 15, then divide by 100.*/
        //taking user input

        Scanner sc = new Scanner(System.in);
        double billamt = sc.nextDouble();
        double tipamt = billamt*15/100;
        System.out.println(tipamt);
        //decesion making
        // use of if else
        int age = 25;
        if(age > 0) {
            if(age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
//use of else if statement
        if(age <= 0) {
            System.out.println("Error");
        } else if(age <= 16) {
            System.out.println("Too Young");
        } else if(age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
        /* test case2
        Boiling Water
You are making a program for a water sensor that should check if the water is boiling.

Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100.

Output "Not boiling" if it's not.

Sample Input

105

Sample Output

Boiling
 */
       int Celsius = sc.nextInt();
        if( Celsius >= 100){
            System.out.println("Boiling ");

        }else {
            System.out.println(" Not boiling ");
        }
        /*Boxes
You are making a robot that should categorize items by their color.

Each color corresponds to a box with a specific number.

For simplicity, our program will handle 3 colors:

red goes to box #1

green goes to box #2

black goes to box #3

Your program needs to take a color as input and output the corresponding box number.

Sample Input

green

Sample Output

2*/
        String color = sc.nextLine();
        switch(color) {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;
            default:
                System.out.println(" please enter only red or green or black");

            }
    }
}
