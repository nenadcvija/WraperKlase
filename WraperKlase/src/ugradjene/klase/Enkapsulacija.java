package ugradjene.klase;

public class Enkapsulacija {
	
	public static void daLiJeSlovo(char karakter) {
		
		boolean s = Character.isLetter(karakter);
		if(s) {
			System.out.println("Ovo je slovo");
		}else {
			System.out.println("Ovo nije slovo");
		}	
		
	}
	
	public static void brojacSlova(String rec) {
		
		System.out.println("Ova rec ima " + rec.length() + " slova");
		
	}
	
	public static void passwordValidation(String password) {
		
		int duzinaPassworda = password.length();  // minimum 8
		int brojevi = 0;    //tacno 3
		int velikaSlova = 0;  // bar 1
		
		
		if(duzinaPassworda < 8) {
			System.out.println("Minimalna duzina mora sadrzati 8 karaktera");
		}else {
			for(int i = 0; i < duzinaPassworda ; i++) {
				
				char karakter = password.charAt(i);
				if(Character.isDigit(karakter)) {
					brojevi ++;
				}
				
				if(Character.isUpperCase(karakter)) {
					velikaSlova ++;
				}		
			}
			if(brojevi !=3) {
				System.out.println("Mora biti tacno 3 broja");
			}else if(velikaSlova < 1) {
				System.out.println("Mora biti bar 1 veliko slovo!");
			}else {
				System.out.println("Prosao si!");
			}
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
