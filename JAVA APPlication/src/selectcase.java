import java.util.Scanner;

public class selectcase {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("enter any number from 1 to 3");
	     int num;
	     num = number.nextInt();
		System.out.println("u enetered number" +num);
		switch (num) {
		case 1:
			System.out.println("your number is one");
			break;
		case 2:
			System.out.println("your number is two");
			break;
		case 3:
			System.out.println("your number is three");
			break;
		default:
			System.out.println("this is not from the given choice");
			break;
			
			
		}
		
		
		

	}

}
