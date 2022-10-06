package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		
	}

}
 