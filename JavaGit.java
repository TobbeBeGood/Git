import java.util.Scanner;

public class JavaGit {

	static Scanner notiz =new Scanner(System.in);
	static Scanner seite =new Scanner(System.in);

	public static void main (String[] args){

		
		System.out.println("this program has a couple of functions to train the use of Git with sourcecode");
		//TimeUnit.SECONDS.sleep(2);

		System.out.println("Bitte geben Sie ihre Notiz ein: ");

		Notizblock.speichern(notiz.next());


		System.out.println("Auf welcher Seite möchten Sie nachschlagen? ");
		int seitenzahl= seite.nextInt();

		System.out.println(Notizblock.abrufen(seitenzahl));


	}

}