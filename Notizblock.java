import java.util.ArrayList;
	
	

public class Notizblock{



	static int speicherplatz=0;
	static ArrayList<String> notizen = new ArrayList<String>();

	public static void speichern(String abl){

		notizen.add(speicherplatz, abl);

		speicherplatz++;

		System.out.println("Die notiz wurde abgelegtauf Seite "+speicherplatz);

	}	

	public static String abrufen(int Seite){

		
		return notizen.get(Seite-1);

	}
}