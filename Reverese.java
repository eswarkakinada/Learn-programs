package Learn;

import java.util.Scanner;

public class Reverese {

	public static void rev() {

		int x, y, z = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x > 0) {
			y = x % 10;
			z = z * 10 + y;
			x = x / 10;
		}
		System.out.println(z);
	}

	public static void main(String[] args) {

		rev();

	}

}
