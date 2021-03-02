import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class kt2
{
    public static void main(String[] args) 
    {
		int count;
    	double arv1, arv2, summa;
		char[] digits1, digits2, digits3;
		
		count = -1;
    	//Arvude sisestamine
        Scanner scan = new Scanner(System.in);
        System.out.print("Palun sisestage üks aaval kaks arvu mida soovite lahutada \n");
        arv1 = scan.nextDouble();
		
		arv2 = scan.nextDouble();
		System.out.println(" ");
		
		//Digits in arv1
		String number = String.valueOf(arv1);

        digits1 = number.toCharArray();
		
		//Digits in arv2
		String number2 = String.valueOf(arv2);

        digits2 = number2.toCharArray();
		
		//Pikkused
		int pikkus1 = digits1.length;
		int pikkus2 = digits2.length;
		
		//Järjekord
		if (arv1 > arv2) {
			
			if (pikkus1 == pikkus2) {
				System.out.println(" " + arv1);
				System.out.println("-" + arv2);
			}
			else if (pikkus1 > pikkus2) {
				System.out.println(" " + arv1);
				
				System.out.printf("-");
				int pikkus = pikkus1 - pikkus2;
				while (pikkus != 0){
					System.out.printf(" ");
					pikkus2 = pikkus2 + 1;
					pikkus = pikkus1 - pikkus2;
					count = count + 1;
				}
				System.out.printf("%s%n", arv2);
			}
			else if (pikkus2 > pikkus1) {
				System.out.println(" " + arv1);
				System.out.printf("-");
				System.out.printf("%s%n", arv2);
				count = count + 1;
			}
			//Vastuse print
			summa = arv1 - arv2;
			String number3 = String.valueOf(summa);

			digits3 = number3.toCharArray();
		
			int pikkus3 = digits3.length;

			System.out.println(" "+ Math.abs(summa));

		}
		else {
			if (pikkus1 == pikkus2){
				System.out.println(" " + arv2);
				System.out.println("-" + arv1);
			}
			else if (pikkus2 > pikkus1) {
				System.out.println(" " + arv2);
				
				System.out.printf("-");
				int pikkus = pikkus2 - pikkus1;
				while (pikkus != 0){
					System.out.printf(" ");
					pikkus1 = pikkus1 + 1;
					pikkus = pikkus2 - pikkus1;
					count = count + 1;
				}
				System.out.printf("%s%n", arv1);
			}
			else if (pikkus1 > pikkus2) {
				System.out.println(" " + arv2);
				System.out.printf("-");
				System.out.printf("%s%n", arv1);
				count = count + 1;
			}	

			//Vastuse print
			summa = arv2 - arv1;
			String number3 = String.valueOf(summa);

			digits3 = number3.toCharArray();
		
			int pikkus3 = digits3.length;
			

			System.out.println(" "+ Math.abs(summa));
		}
		System.out.println(" ");
	}
}