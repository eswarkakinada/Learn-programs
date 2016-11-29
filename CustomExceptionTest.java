package exception;

import java.util.Scanner;

public class CustomExceptionTest {
	int age;

	public void checkAge() throws InvalidAgeException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age ");
		age = sc.nextInt();
		if (age >= 18) {
			if (age <= 25) {
				System.out.println("Eligible " + age);
			}

		} else {

			System.out.println(" nEligible age    :  " + age);
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) {

		CustomExceptionTest c1 = new CustomExceptionTest();

		try {
			c1.checkAge();
		} catch (Exception e) {
			System.out.println("Exception Caught :  " + e);
		}

	}

}
