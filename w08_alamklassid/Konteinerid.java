public class Konteinerid {
    int VedelikuMaht = 0;

    public void VeesOlevVedelik() {
        System.out.println("Nimetatud Konteineris on " + VedelikuMaht + " ml vett.");
    }

    public void KallaVett(int KuiPalju) {
        VedelikuMaht += KuiPalju;
		System.out.println("Kallame " + KuiPalju + " ml vett juurde nimetatud kontainerisse.");
    }

    public void KasKonteinerTais(int VeePudeliMaht, int veekogus) {
        if(VedelikuMaht < VeePudeliMaht) {
            System.out.println("Konteineris tundub olevat veel ruumi veele. Konteineris on ainult " + veekogus + " ml vett.");
        } 
		else if (VedelikuMaht == VeePudeliMaht){
            System.out.println("Kontainer on täielikult täidetud veega. Konteineris on " + veekogus + " ml vett. Tubli töö ^_^");
        }
		else {
			System.out.println("Oi oi, kontainer on täidetud " + VeePudeliMaht + " ml veega aga ülejäänud veest on üle voolanud.");
		}
    }
}