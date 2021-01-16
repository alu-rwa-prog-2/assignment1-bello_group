/*
Author: Bello Moussa Amadou
Email : b.moussaama@alustudent.com
**/

/* 
The first part of this program helps us caclculate the BMI(Body Mass Index)
*/
import java.util.Scanner; // to get the user inputs

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nLet's calculate your Body Mass Index (BMI)");
        String name;
        System.out.print("\nPlease enter your name: ");
        name = input.next();
        System.out.print("\nWhat's your weight in kilogram? ");
        double weight = input.nextDouble();
        System.out.print("\nWhat's your height in meters? ");
        double height = input.nextDouble();
        double BMI = weight / (height * height); // the formula to get the BMI
        System.out.print("\nThe Body Mass Index (BMI) of " + name + " is " + BMI + " kg/m2\n\n");
/*
Second Part for the rectangle's Surface and Perimeter
*/
        // Declaring variables
        System.out.println(
                "\nThis program will help you calculate the surface and the perimeter of your desired rectangle");
        System.out.print("\nPlease enter the length of the rectangle in meters: ");
        double length = input.nextDouble();
        System.out.print("\nEnter the width of the rectangle in meters: ");
        double width = input.nextDouble();
        double Perimeter = (length + width) * 2; // Perimeter formula
        double Surface = (length * width); // Surface formula
        System.out.println(
                "\nThe perimeter is: " + Perimeter + " m" + " and, " + "\nThe Surface is: " + Surface + " m2\n\n");
    }
}
