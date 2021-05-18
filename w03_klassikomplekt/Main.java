import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Vaadake, millisesse Itella pakiautomaadi uksese mahub teie pakk:");
		
		System.out.println("Sisestage paki pikkus: ");
        Scanner input = new Scanner(System.in);
		double pikkus = input.nextInt();
		
		System.out.println("Sisestage paki laius: ");
        Scanner input2 = new Scanner(System.in);
		double laius = input2.nextInt();
		
		System.out.println("Sisestage paki korgus: ");
        Scanner input3 = new Scanner(System.in);
		double korgus = input3.nextInt();

        Kalkulaator.checker(pikkus, laius, korgus);

    }
}