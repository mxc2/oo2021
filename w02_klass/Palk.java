import java.util.Scanner;

public class Palk{
    String nimi;
    int bruto;
    int maksuvaba;
	
	double tootuskindlustus;
	double kogumispension;
	double tulumaks;
    double neto;
	
    public double NetoKalkulaator(){
		System.out.print("-----------------------------------------------\n");
		System.out.print("Töötaja " + nimi + " bruto palk on " + bruto + " eurot. \n");
		
		System.out.println("Palun sisestage töötaja tulumaksuvaba miinimum: ");
		Scanner input = new Scanner(System.in);
		
		tulumaks = input.nextInt();
		
        tootuskindlustus = bruto - (bruto * 0.016);
		kogumispension = tootuskindlustus - (tootuskindlustus * 0.02);
		tulumaks = (kogumispension - maksuvaba) * 0.2;
		neto = kogumispension - tulumaks;
		
        System.out.print("Töötaja " + nimi + " saab kätte ");
		
        return neto;
    }
	
	public Palk(String worker, int summa){
        nimi = worker;
        bruto = summa;
    }

}