public class Arvutus1 {
	public static void main(String[] arg){
		double mass=73.5;
		System.out.println(mass+10);
		System.out.println(mass*2);
		System.out.println(mass/2);
		
		String eesnimi = "juku";
		int vanus = 7;
		
		if(vanus < 7){
			System.out.println("Tasuta");
		} else {
			System.out.println(eesnimi + ", osta pilet!");
		}
		
		long molekule = 452348675834765L;
		System.out.println(molekule % 1000);
		
		short palk = 12000;
		short kogupalk = (short) (palk * (short)2);
		System.out.println(kogupalk);
		
		byte loendur = 20;
		
		float vahemaa = 100.25f;
	}
	
}