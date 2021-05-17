import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println(" ");
		
		System.out.println("Testime vee pudeliga.");
        Veepudel v = new Veepudel();
		
		//Toob välja kui suur on veepudel
        v.VeePudeliMaht();
		
		//Toob välja palju vedelikku on veepudelis
        v.VeesOlevVedelik();
		
		//Lisame vedelikku juurde veepudelisse
		System.out.println("-Lisame vett juurde pudelisse. Palun sisestage number, mis tähistab mitu ml vett soovite kallata pudelisse:");
        Scanner input = new Scanner(System.in);
		int veekogus = input.nextInt();
        v.KallaVett(veekogus);
        
		v.KasKonteinerTais(v.VeePudeliMaht, veekogus);
        System.out.println(" ");
		System.out.println("______");
		System.out.println(" ");
		
		//RUN 2
		
		System.out.println("Testime nüüd kanistriga.");
        Kanister k = new Kanister();
		
		//Toob välja kui suur on veepudel
        k.KanistriMaht();
		
		//Toob välja palju vedelikku on veepudelis
        k.VeesOlevVedelik();
		
		//Lisame vedelikku juurde veepudelisse
		System.out.println("-Lisame vett juurde kanistrisse. Palun sisestage number, mis tähistab mitu ml vett soovite kallata pudelisse:");
        Scanner input2 = new Scanner(System.in);
		int veekogus2 = input2.nextInt();
        k.KallaVett(veekogus2);
        
		k.KasKonteinerTais(k.KanistriMaht, veekogus2);
    }
}