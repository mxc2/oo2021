public class Arvutus2{
	public static void main(String[] arg){
		System.out.println("argumente: "+arg.length);
		if(arg.length==1){
			System.out.println("Ainuke: "+arg[0]);
		}
		if(arg.length==2){
			System.out.println("Loodetavasti kaks arvu");
			int arv1=Integer.parseInt(arg[0]);
			int arv2=Integer.parseInt(arg[1]);
			System.out.println(arv1*arv2);
			
		}
		 if(arg.length==3){
			System.out.println("Äkki tuleb 3 arvu");
			int arv1=Integer.parseInt(arg[0]);
			int arv2=Integer.parseInt(arg[1]);
			int arv3=Integer.parseInt(arg[2]);
			System.out.println(arv1+arv2+arv3);
		 }	
			for(String a: arg){
				System.out.println(a);
			}
			for(int i=0; i<arg.length; i++){
				System.out.println("Kohal "+i+" on "+arg[i]);
			} 
		
		if (arg.length>=4){
				int summa=0;
				for (int i=0; i<arg.length; i++){
					summa = summa + Integer.parseInt(arg[i]);
				}
				System.out.println(summa);
		}
				
	} 
}