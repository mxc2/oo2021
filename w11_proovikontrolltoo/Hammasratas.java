  public class Hammasratas {
	int HammasrattaHambaid;
    int Tiir = 0;
	int KusMaal = 0;

    public Hammasratas(int MituKordaEtTiir) {
        HammasrattaHambaid = MituKordaEtTiir;
    }

    public void MoveForward() {
		KusMaal = KusMaal + 1;
		
		//Kui pendel teinud tik tak
        if(KusMaal % HammasrattaHambaid == 0) {
            Tiir = Tiir + 1;
            System.out.println("Hammasratas on teinud " + Tiir + ". tiiru.");
        }
    }
}