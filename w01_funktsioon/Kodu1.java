import java.util.Scanner;

public class Kodu1 {
   public int arv() {
      int number;
	  
	  System.out.println("Palun sisestage üks suvaline number:");
	  
	  Scanner input = new Scanner(System.in);
	  number = input.nextInt();
	  
	  int arvutatud = number % 2;
      return arvutatud;
   }
   public static void main(String args[]) {
      Kodu1 test = new Kodu1();
      int arv = test.arv();
      if ( arv == 0 )
        System.out.println("Sisestatud number on paarisarv");
      else
        System.out.println("Sisestatud number on paarituarv");
   }
}