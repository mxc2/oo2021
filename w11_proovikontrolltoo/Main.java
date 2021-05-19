  public class Main {
    public static void main(String[] arg) throws InterruptedException {
		//Sisestada pendlipkkus ja mitukorda pendel peab käima et hammasrattal saaks tiir täis
		double Pendlipikkus = 0.5;
		int MituKordaEtTiir = 2;
		
		//Saadab faili int ja double
        Hammasratas H = new Hammasratas(MituKordaEtTiir);
        Pendel pendel = new Pendel(Pendlipikkus, H);
    }
}