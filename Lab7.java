package Lab7;

import java.util.Scanner;
import Lab7.Validator;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
//		scnr.nextLine();

		System.out.println("Please enter a valid name: ");
		String name = scnr.nextLine();
		System.out.println("You entered '" + name + "'");
		System.out.println(nameIsValid(name));

		System.out.println("Please enter a valid email: ");
		String email = scnr.nextLine();
		System.out.println("You entered '" + email + "'");
		System.out.println(emailIsValid(email));

		System.out.println("Enter a phone number in (xxx) xxx-xxxx format: ");
		String num = scnr.nextLine();
		System.out.println("You entered '" + num + "'");
		System.out.println(phoneNumberIsValid(num));

		System.out.println("Enter a date in MM/dd/yyyy format: ");
		String date = scnr.nextLine();
		System.out.println("You entered '" + date + "'");
		System.out.println(dateIsValid(date));
		
		scnr.close();

	}

	public static String dateIsValid(String str) {
		
		String date = str;
		if (date.matches("((0[1-9])|(1[0-2]))\\/((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))\\/\\d{4}")) {
			return "Date is valid.";
		}

		return "Date is invalid.";
	}

	public static String phoneNumberIsValid(String str) {

		String phoneNum = str;
		if (phoneNum.matches("[\\(]\\d{3}[\\)][\\s]\\d{3}\\-\\d{4}")) {
			return "Phone number is valid.";
		}
		return "Phone number is invalid.";
	}

	public static String nameIsValid(String str) {

		String name = str;
		if (name.matches("[A-Z][a-z]*") && name.length() < 30) {
			return "Name is valid.";
		}
		return "Name is invalid.";
	}

	public static String emailIsValid(String str) {

		String email = str;
		if (email.matches("[a-zA-Z0-9]{5,30}[\\@][a-zA-Z0-9]{5,10}\\.[a-zA-Z0-9]{2,3}")) {
			return "Email is valid.";
		}

		return "Email is invalid";
	}

}
