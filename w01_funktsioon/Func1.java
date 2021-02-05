public class Func1{
	//Takso sõit
    public static double taksoSoit(double k){
        return 3 + (k*0.8);
    }
	//Temperatuuri hinnang
    public static String temperatuuriHinnang(int t){
        if(t<18){return "külm";}
        return "soe";
    }
	//Ringi pindala
    public static double ringiPindala(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] arg){
        System.out.println(ringiPindala(5));
        if(arg.length==1){
            System.out.println(
             temperatuuriHinnang(
               Integer.parseInt(arg[0])));
        }
    }
}