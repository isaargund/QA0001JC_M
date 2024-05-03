package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Example: Ask user to enter the width and the length of a rectangle
        //Then print the area and perimeter on the console

        //Area: width*length
        //Perimeter = 2*width + 2*length
        //use float data type
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width and the length of a rectangle");
        float width = input.nextFloat();
        float length = input.nextFloat();
        System.out.println("area="+(width*length));
        System.out.println("perimeter="+(2*(width)+2*(length)));

    }
}
