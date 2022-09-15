package arraysDemo;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 14

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ali";
		String ogrenci2 = "Veli";
		String ogrenci3 = "Mustafa";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Emre";
		ogrenciler[1] = "Can";
		ogrenciler[2] = "Satık";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
