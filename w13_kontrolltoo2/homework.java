public class homework{
    public static void main(String[] arg){
		//Siia sisestada toitaine nimed ja andmed
		String Kartul;
		String Hapukoor;
		String Vorst;
		
		double kartul_valgud = 1.9;
		double kartul_susivesikud = 15.5;
		double kartul_rasvad = 0.1;
		
		double hapukoor_valgud = 3;
		double hapukoor_susivesikud = 4.1;
		double hapukoor_rasvad = 10;
		
		double vorst_valgud = 11.6;
		double vorst_susivesikud = 9.2;
		double vorst_rasvad = 19.6;
		
		Protsent worker = new Protsent("Kartul", kartul_valgud, kartul_susivesikud, kartul_rasvad, "Hapukoor", hapukoor_valgud, hapukoor_susivesikud, hapukoor_rasvad, "Vorst", vorst_valgud, vorst_susivesikud, vorst_rasvad);

		System.out.println((worker.Protsent()));
		
        ToiduKomponendid worker1 = new ToiduKomponendid("Kartul", kartul_valgud, kartul_susivesikud, kartul_rasvad, "Hapukoor", hapukoor_valgud, hapukoor_susivesikud, hapukoor_rasvad, "Vorst", vorst_valgud, vorst_susivesikud, vorst_rasvad);

		System.out.println((worker1.ToiduKomponendid()));
    }
}
