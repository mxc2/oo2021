import java.util.Scanner;

public class ToiduKomponendid{
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
	
	double TotalValgud;
	double TotalSusivesikud;
	double TotalRasvad;
	double RasvaPercentage;
	double neto;
	
	//Toidukomponendid, 100g kartulid, 30g hapukoor, 50g vorsti
    public double ToiduKomponendid(){
		//Calculate Valgud
		TotalValgud = k_valgud + (h_valgud * 0.3) + (h_susivesikud * 0.5);
		
		//Calculate susivesikud
		TotalSusivesikud = k_susivesikud + (h_susivesikud * 0.3) + (v_susivesikud * 0.5);
		
		//Calculate rasvad
		TotalRasvad = k_rasvad + (h_rasvad * 0.3) + (v_rasvad * 0.5);
		
		//Calculate Percentage
		RasvaPercentage = (TotalRasvad / (TotalValgud + TotalSusivesikud + TotalRasvad)) * 100;
		
		System.out.print("-----------------------------------------------\n");
		System.out.print("Toidukomponendides, kus on 100g kartulid, 30g hapukoor ja 50g vorsti. Seal on " + RasvaPercentage + " % rasva \n");
        return neto;
    }
	
	//nö improtin andmed, et arvutada 100g kartulid, 30g hapukoor, 50g vorsti
	public ToiduKomponendid(String kartul, double k_valgud1, double k_susivesikud1, double k_rasvad1, String hapukoor, double h_valgud1, double h_susivesikud1, double h_rasvad1, String vorst, double v_valgud1, double v_susivesikud1, double v_rasvad1){
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