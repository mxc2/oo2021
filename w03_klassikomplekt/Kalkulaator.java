public class Kalkulaator {

    public static void checker(double pikkus, double laius, double korgus) {

        if(pikkus < 35 && laius < 43 && korgus < 6){
			System.out.println("Pakk mahub XS pakiautomaadi uksest sisse.");
		}
		else if (pikkus < 35 && laius < 43 && korgus < 13){
			System.out.println("Pakk mahub S pakiautomaadi uksest sisse.");
		}
		else if (pikkus < 35 && laius < 43 && korgus < 21){
			System.out.println("Pakk mahub M pakiautomaadi uksest sisse.");
		}
		else if (pikkus < 37 && laius < 43 && korgus < 35){
			System.out.println("Pakk mahub L pakiautomaadi uksest sisse.");
		}
		else if (pikkus < 37 && laius < 61 && korgus < 61){
			System.out.println("Pakk mahub XL pakiautomaadi uksest sisse.");
		}
		else{
			System.out.println("Kahjuks ei mahu pakk pakiautomaati");			
		}
    }
}