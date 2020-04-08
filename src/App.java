import java.util.Scanner;

public class App {
	public static void main (String[] args) {
	
	int age;	


	boolean czyPoprawne = false;	
	
	while(!czyPoprawne) {
		
	
		
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj swój wiek: ");
	
		try {
			age = in.nextInt();
			System.out.println("Twój wiek to: " + age + " lat.");
			break;
		}
			catch (java.util.InputMismatchException e) {
				System.out.println("Podaj cyfrê");
			}
		
	}

	System.out.println("Gratulacje, poda³eœ prawid³owy wiek.");
	
	}
}
