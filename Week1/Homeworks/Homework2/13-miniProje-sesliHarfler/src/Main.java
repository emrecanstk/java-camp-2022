
// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 20

public class Main {

	public static void main(String[] args) {
		char harf = 'e';
		
		char[] inceler = {'e','i','ö','ü'};
		char[] kalinlar = {'a','ı','o','u'};
		
		for(char h:inceler) {
			if(h==harf) {
				System.out.println(harf+" incedir.");
				return;
			}
		}
		for(char h:kalinlar) {
			if(h==harf) {
				System.out.println(harf+" kalındır.");
				return;
			}
		}
		System.out.println("ne ince ne de kalındır.");

	}

}
