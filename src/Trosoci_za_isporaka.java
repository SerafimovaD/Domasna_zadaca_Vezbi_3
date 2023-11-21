import java.util.Scanner;

public class Trosoci_za_isporaka {

	public static void main(String[] args) {
		double tezina;
		Scanner tastatura=new Scanner(System.in);
		tezina=tastatura.nextDouble();
		System.out.print("Vnesete ja tezinata na vasiot paket");
		if(tezina>=0 && tezina<=2) {
			System.out.print("Trosocite za isporaka se 300 denari");
		}
		else if(tezina>=2 && tezina<=4) {
			System.out.print("Trosocite za isporaka se 700 denari");
		}
		else if(tezina>=4 && tezina<=10) {
			System.out.print("Trosocite za isporaka se 2000 denari");
		}
		else if(tezina>=10 && tezina<=20) {
			System.out.print("Trosocite za isporaka se 5000 denari");
		}
		else {
			System.out.print("Paketot ne moze da se isprati");
		}

	}

}
