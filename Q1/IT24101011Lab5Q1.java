import java.util.Scanner;

public class IT24101011Lab5Q1 {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.print("Enter the first integer:");
		int number1 = numbers.nextInt();

		System.out.print("Enter the second integer:");
		int number2 = numbers.nextInt();

		System.out.print("Enter the third integer:");
		int number3 = numbers.nextInt();
		
		int Smallest = number1;
		int Largest = number1;

		if ((number1 < number2) || (number1 < number3)){
			Smallest = number1;
		}
		if ((number2 < number1) || (number2 < number3)){
			Smallest = number2;
		}
		if ((number3 < number1) || (number3 < number2)){
			Smallest = number3;
		}

		if ((number1 > number2) || (number1 > number3)){
			Largest = number1;
		}
		if ((number2 > number1) || (number2 > number3)){
			Largest = number2;
		}
		if ((number3 > number1) || (number3 > number2)){
			Largest = number3;
		}
		System.out.println(" ");
		System.out.println("User entered numbers are :"+number1+" "+number2+" "+number3);
		System.out.println("The Smallest number is: " +Smallest);
		System.out.println("The Largest number is: " +Largest);
	}

}	
