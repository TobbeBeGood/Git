public class Notizblock{

	static int speicherplatz=0;
	static String[] notizen;

	public static void speichern(String abl){

		notizen[Speicherplatz]=abl;

		speicherplatz++;

		System.out.println("Die notiz wurde abgelegtauf Seite "+Speicherplatz);

	}	

	public static String abrufen(int Seite){

		
		return notizen [Seite-1];

	}
}