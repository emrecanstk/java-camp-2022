
// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 21

public class Main {

	public static void main(String[] args) {
		
		int number=7;
		int sum=0;
		
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
				sum+=i;
			}
			
		}
		if(sum==number) {
			System.out.println(number+" sayısı bir mükemmel sayıdır.");
		}
		else {
			System.out.println(number+" sayısı bir mükemmel sayı değildir.");
		}

	}

}
