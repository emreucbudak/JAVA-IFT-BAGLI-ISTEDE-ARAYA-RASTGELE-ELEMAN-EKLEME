package ciftbagli;

public class Bagli {

	public static void main(String[] args) {
		Liste listem = new Liste();
		listem.basEkle(25);
		listem.basEkle(35);
		listem.basEkle(45);
		listem.basEkle(55);
		listem.sonEkle(65);
		listem.sonEkle(75);
		listem.sonEkle(85);
		listem.sonEkle(95);
		listem.arayaEkle(45, 4);
		listem.yazdir();
		listem.arayaEkle(25, 5);
		listem.yazdir();
	}

}
