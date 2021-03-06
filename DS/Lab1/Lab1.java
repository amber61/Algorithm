package first.lab1;

import java.util.Scanner;

public class Lab1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Numbers n = new Numbers();

	do {
	    System.out.print(
		    "Enter 1 to create array of new size, 2 to generate random numbers into array, 3 to count a value, 4 to display array, 0 to quit: ");

	    int menu = input.nextInt();
	    switch (menu) {
	    case 0:
		System.exit(0);
	    case 1:
		System.out.println("Enter new size: ");
		int size = input.nextInt();
		n = new Numbers(size);
		System.out.println("Array has been generated\n\n");
		break;
	    case 2:
		n.generateNumbers();
		System.out.println("Numbers have been generated\n\n");
		break;
	    case 3:
		System.out.println("Enter number to search for: ");
		int value2 = input.nextInt();
		System.out.println(
			"\nThere are " + n.count(value2) + " of the number " + value2 + " using fastest way\n\n");
		break;
	    case 4:
		System.out.println("The numbers are: \n" + n.toString() + "\n\n");
		break;
	    case 5:
		System.out.println("Just record myself lowest way compared to case 3");
		System.out.println("Enter number to search for: ");
		int value1 = input.nextInt();
		System.out.println("\nThere are " + n.count(value1) + " of the number " + value1 + "\n\n");
		break;
	    default:
		System.out.println("Please enter a valid number\n\n");
		break;
	    }
	} while (true);

    }

}
