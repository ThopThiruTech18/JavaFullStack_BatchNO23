package in.thiru.patterns;

public class Example18 {

	public static void main(String[] args) {
		
		System.out.println("started pattern");

		
		int k=1;
		
		for (int i = 5; i >=1; i--) {
			
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print((k++)+" ");
				
			}
			
			System.out.println();
			
		}

		
		
		System.out.println("ended the pattern");
	}

}
