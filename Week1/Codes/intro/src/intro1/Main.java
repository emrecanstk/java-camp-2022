package intro1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 10;
		
		System.out.println(altMetin+": "+vade);
		
		double dolarDun = 18.15;
		double dolarBugun = 18.04;
		
		boolean dolarDustuMu = false;
		
		String okYonu;
		
		if(dolarBugun < dolarDun) {
			okYonu = "down.svg";
		}
		else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
		}
		else {
			okYonu = "equal.svg";
		}
		
		System.out.println(okYonu);
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}