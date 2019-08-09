public class JavaGit {

	import java.util.Scanner;

	Scanner notiz =new Scanner(System.in);

	public static void main (String[] args){

		
		System.out.println("this program has a couple of functions to train the use of Git with sourcecode");
		TimeUnit.SECONDS.sleep(2);

		System.out.prinln("Bitte geben Sie ihre Notiz ein: ");

		Notizblock.speichern(notiz.next());


		//Methode zum Ausführen einer Benutzer-bestimmten Funktion

	}

}