package multiDArrayDemo;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 16

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Eskişehir";
		sehirler[1][1] = "İzmir";
		sehirler[1][2] = "Edirne";
		sehirler[2][0] = "Tekirdağ";
		sehirler[2][1] = "Balıkesir";
		sehirler[2][2] = "Manisa";
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println();
		} 

	}

}
