public class koduneyhendus{
    public static void main(String[] arg){
        Lyliti a = new Lyliti();
        Lyliti b = new Lyliti();
        Lyliti c = new Lyliti();
        Lyliti d = new Lyliti();
        Lyliti e = new Lyliti();
        Lyliti z = new Lyliti();
		
		//Siin valida mis lüliti seisund true ja mille false
        a.seisund(true);
		b.seisund(false);
        c.seisund(false);
        d.seisund(false);
        e.seisund(false);
        z.seisund(true);
		
		//Siin hakkab seestpoolt välja kontrollima, et kas saab lülituse teha
        Jadayhendus j1 = new Jadayhendus();
        j1.lisa(d); j1.lisa(e);
        Roopyhendus r1 = new Roopyhendus();
        r1.lisa(c); r1.lisa(j1);
        Jadayhendus j2 = new Jadayhendus();
        j2.lisa(b); j2.lisa(r1);
        Roopyhendus r2 = new Roopyhendus();
        r2.lisa(z); r2.lisa(j2);
        Jadayhendus lopp = new Jadayhendus();
        lopp.lisa(a); lopp.lisa(r2);
        
		//Saadab printima
        Final(lopp);
    }
	public static void Final(Voolujuht v){
		//Prindib
        if(v.kasJuhib()){
            System.out.println("Hurray! Me saime voolu läbi saata!");
        } else {
            System.out.println("Vool ei jõudnud lõpuni :(");
        }
    }
}