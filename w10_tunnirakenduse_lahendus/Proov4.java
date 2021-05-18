public class Proov4{
    public static void main(String[] arg){
        Puhver<Integer, Integer> p1=new Puhver<Integer, Integer>(new RuuduArvutaja());
		Puhver<String, String> p2=new Puhver<String, String>(new KahekordeArvutaja());
		Puhver<Integer, Integer> p3=new Puhver<Integer, Integer>(new Liitja());
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);
		
		System.out.println(" ");
		System.out.println("- - -");
		System.out.println(" ");
		
		System.out.println(p2.arvuta("Minu nimi on Peeter ja ma olen Peeter? "));
		
		System.out.println(" ");
		System.out.println("- - -");
		System.out.println(" ");
		
		System.out.println(p3.arvuta(5));
        System.out.println(p3.arvuta(3));
        System.out.println(p3.hoidla);
    }
}