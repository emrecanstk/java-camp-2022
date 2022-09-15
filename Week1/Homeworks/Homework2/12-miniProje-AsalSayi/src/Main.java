
// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 19

public class Main {

	public static void main(String[] args) {
		
		int number = 25;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("sayı asal değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("sayı asaldır.");
		}
		else {
			System.out.println("sayı asal değildir");
		}

	}

}
