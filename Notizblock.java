public class Notizblock{

	static int speicherplatz=0;
	static String[] notizen;

	public static void speichern(String abl){

		notizen[speicherplatz]=abl;

		speicherplatz++;

		System.out.println("Die notiz wurde abgelegtauf Seite "+speicherplatz);

	}	

	public static String abrufen(int Seite){

		
		return notizen [Seite-1];

	}
}