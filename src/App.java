import java.util.Scanner;

public class App {
	public static void main (String[] args) {
	
	int age;	


	boolean czyPoprawne = false;	
	
	while(!czyPoprawne) {
		
	
		
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj sw�j wiek: ");
	
		try {
			age = in.nextInt();
			System.out.println("Tw�j wiek to: " + age + " lat.");
			break;
		}
			catch (java.util.InputMismatchException e) {
				System.out.println("Podaj cyfr�");
			}
		
	}

	System.out.println("Gratulacje, poda�e� prawid�owy wiek.");
	
	}
}
