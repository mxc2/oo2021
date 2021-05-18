import java.util.Scanner;

public class Protsent{
    String Kartul;
	String Hapukoor;
	String Vorst;
	
    double k_valgud;
	double k_susivesikud;
	double k_rasvad;
	
	double h_valgud;
	double h_susivesikud;
	double h_rasvad;
	
	double v_valgud;
	double v_susivesikud;
	double v_rasvad;
	
	double KartulPrtosent;
	double HapukoorProtsent;
	double VorstProtsent;
	double PercentageCheck;
	double neto;
	
    public double Protsent(){
		
		//Calculate Kartuli protsendid
		k_valgud = k_valgud / (k_valgud + k_susivesikud + k_rasvad) * 100;
		k_susivesikud = k_susivesikud / (k_valgud + k_susivesikud + k_rasvad) * 100;
		k_rasvad = k_rasvad / (k_valgud + k_susivesikud + k_rasvad) * 100;
		PercentageCheck = k_rasvad + k_valgud + k_susivesikud;
		
		if (PercentageCheck > 100) {
			System.out.print("Palun kontrollige sisestatud andmeid, protsendi väärtus on üle 100%");
			System.exit(0);
		}else{
			PercentageCheck = 0;
		}
		
		//Calculate Hapukoore Protsendid
		h_valgud = h_valgud / (h_valgud + h_susivesikud + h_rasvad) * 100;
		h_susivesikud = h_susivesikud / (h_valgud + h_susivesikud + h_rasvad) * 100;
		h_rasvad = h_rasvad / (h_valgud + h_susivesikud + h_rasvad) * 100;
		PercentageCheck = h_rasvad + h_valgud + h_susivesikud;
		
		if (PercentageCheck > 100) {
			System.out.print("Palun kontrollige sisestatud andmeid, protsendi väärtus on üle 100%");
			System.exit(0);
		}else{
			PercentageCheck = 0;
		}
		
		//Calculate Vorsti Protsendid
		v_valgud = v_valgud / (v_valgud + v_susivesikud + v_rasvad) * 100;
		v_susivesikud = v_susivesikud / (v_valgud + v_susivesikud + v_rasvad) * 100;
		v_rasvad = v_rasvad / (v_valgud + v_susivesikud + v_rasvad) * 100;
		
		PercentageCheck = v_rasvad + v_valgud + v_susivesikud;
		
		if (PercentageCheck > 100) {
			System.out.print("Palun kontrollige sisestatud andmeid, protsendi väärtus on üle 100%");
			System.exit(0);
		}else{
			PercentageCheck = 0;
		}
		
		System.out.print("-----------------------------------------------\n");
		System.out.print("\n");
		System.out.print("Toitaine " + Kartul + "\n");
		System.out.print("Nimetatud toiduaines on valke: " + k_valgud + "% \n");
		System.out.print("Nimetatud toiduaines on süsivesikuid: " + k_susivesikud + "% \n");
		System.out.print("Nimetatud toiduaines on rasve: " + k_rasvad + "% \n");
		System.out.print("\n");
		System.out.print("-----------------------------------------------\n");
		System.out.print("\n");
        System.out.print("Toitaine " + Hapukoor + "\n");
		System.out.print("Nimetatud toiduaines on valke: " + h_valgud + "% \n");
		System.out.print("Nimetatud toiduaines on süsivesikuid: " + h_susivesikud + "% \n");
		System.out.print("Nimetatud toiduaines on rasve: " + h_rasvad + "% \n");
		System.out.print("\n");
        System.out.print("-----------------------------------------------\n");
		System.out.print("\n");
        System.out.print("Toitaine " + Vorst + "\n");
		System.out.print("Nimetatud toiduaines on valke: " + v_valgud + "% \n");
		System.out.print("Nimetatud toiduaines on süsivesikuid: " + v_susivesikud + "% \n");
		System.out.print("Nimetatud toiduaines on rasve: " + v_rasvad + "% \n");
		System.out.print("\n");
        
		return neto;
    }
	
	//nö improtin andmed, et arvutada 100g kartulid, 30g hapukoor, 50g vorsti
	public Protsent(String kartul, double k_valgud1, double k_susivesikud1, double k_rasvad1, String hapukoor, double h_valgud1, double h_susivesikud1, double h_rasvad1, String vorst, double v_valgud1, double v_susivesikud1, double v_rasvad1){
        Kartul = kartul;
        k_valgud = k_valgud1;
		k_susivesikud = k_susivesikud1;
		k_rasvad = k_rasvad1;
		
		Hapukoor = hapukoor;
        h_valgud = h_valgud1;
		h_susivesikud = h_susivesikud1;
		h_rasvad = h_rasvad1;
		
		Vorst = vorst;
        v_valgud = v_valgud1;
		v_susivesikud = v_susivesikud1;
		v_rasvad = v_rasvad1;
		
    }

}