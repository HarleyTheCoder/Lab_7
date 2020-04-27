import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		validateName(name);
		
		System.out.print("\nPlease enter a valid Email: ");
		String email = scnr.nextLine();
		validateEmail(email);
		
		System.out.print("\nPlease enter a valid Phone Number: ");
		String phone = scnr.nextLine();
		validatePhone(phone);
		
		System.out.print("\nPlease enter a valid Date: ");
		String date = scnr.nextLine();
		validateDate(date);
		
		System.out.print("\nPlease enter valid HTML elements: ");
		String code = scnr.nextLine();
		validateHTML(code);

		//Testing Code
		/*
		NameTests nameTests = new NameTests();
		PhoneTests phoneTests = new PhoneTests();
		EmailTests emailTests = new EmailTests();
		DateTest dateTests = new DateTest();
		
		System.out.println("Name Tests");
		nameTests.testIfEmpty();
		nameTests.testIfNumber();
		nameTests.testIfPascalCase();
		nameTests.testMaxLength();
		nameTests.testSymbols();
		
		System.out.println("Phone Tests");
		phoneTests.testAreaCode();
		phoneTests.testContainsHyphen();
		phoneTests.testContainsNonNumbers();
		phoneTests.testLineNumber();
		phoneTests.testPrefixThreeDigits();
		
		System.out.println("Email Tests");
		emailTests.testAlphanumeric();
		emailTests.testContainsAtSymbol();
		emailTests.testContainsPeriod();
		emailTests.testMaxDomainLength();
		emailTests.testMinLength();
		emailTests.testNoSpecialCharacters();
		emailTests.testTopLevelDomainMax();
		emailTests.testTopLevelDomainMin();
		
		System.out.println("Date Tests");
		dateTests.testContainsForwardSlash();
		dateTests.testDays();
		dateTests.testMonths();
		dateTests.testNonAlphaAndSymbols();
		dateTests.testYears();
		*/
		
		scnr.close();
	}
	
	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z]{1}[A-Za-z]{0,29}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[a-zA-Z\\d]{5,30}@[a-zA-Z\\d]{3,10}.[a-zA-Z\\d]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "[\\d]{3}-[\\d]{3}-[\\d]{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "([\\d]{2}/[\\d]{2}/[\\d]{4})";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	public static boolean validateHTML(String code) {

		// change this to pass ALL tests
		String regex = "<[a-zA-Z\\d]+> <\\/[a-zA-Z\\d]+>";

		if (code.matches(regex)) {
			System.out.println("HTML code is valid!");
			return true;
		} else {
			System.out.println("Sorry, HTML code is not valid!");
			return false;
		}
	}
	
	

}
