public class pkt {
	
	public static void main(String[] arg) {
		//Aritmeetilise keskmise leidmine
		double a = 4;
		double b = 5;
		double c = 6;
		
		//Sending it to AritmeetilineKeskmine klass
        System.out.println("Arvu " + a + ", " + b + " ja " + c + " aritmeetiline keskmine on: "+ AritmeetilineKeskmine(a, b, c));
		
		//Libisev keskmine massiiv
		double[] jada = {15, 13, 5, 8, 9};
		
		//Libiseva keskmise leidmine
        double[] massiiv = LibisevKeskmine(jada);
		
		System.out.println("Massiivi " + jada[0] + ", " + jada[1] + ", " + jada[2] + ", " + jada[3] + ", " + jada[4] + " libisev keskmine on: ");
		
		//Iga erineva libiseva keskmise välja printimine
        for(int i = 0; i<massiiv.length; i++) {
            System.out.println(massiiv[i]);
        }
    }
    public static double AritmeetilineKeskmine(double a, double b, double c) {
        double keskmine = 0;
		
		//Aritmeetilise keskmise arvutamine
        keskmine = (a + b + c) / 3;
        return keskmine;
    }

    public static double[] LibisevKeskmine(double[] arv) {
        double[] tulemus = new double[arv.length - 2];
        for(int i = 0; i < (arv.length - 2); i++) {
            double LibeKeskmine = (arv[i] + arv[i + 1] + arv[i + 2]) / 3;
            tulemus[i] = LibeKeskmine;
        }
        return tulemus;
    }
}