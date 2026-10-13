package in.thiru.patterns;

public class Example28 {

	public static void main(String[] args) {
		
		System.out.println("started");

		for (int i = 5; i >= 1; i--) {

			for (int s = 1; s <= 5 - i; s++) {
				System.out.print("  ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}
		
		System.out.println("ended");

	}

}
