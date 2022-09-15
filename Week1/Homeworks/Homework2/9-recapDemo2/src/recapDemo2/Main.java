package recapDemo2;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 15

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {1.3,1.7,2.3,5.3,7.4,9.1,4,7.37};
		
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			
			if(number>max) {
				max = number;
			}
			
			total += number;
			System.out.println(number);
		}
		
		System.out.println("toplam: "+total);
		System.out.println("max: "+max);
		
	}

}
