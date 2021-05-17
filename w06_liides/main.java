import java.util.Scanner;

public class main{
    public static void main(String arg[]){

        ruut f = new ruut();
        ristkulik r = new ristkulik();
		
		System.out.println("Palun sisestage ruudu ühe külje pikkus: ");
		Scanner input = new Scanner(System.in);
		
		double a = input.nextInt();
		
		System.out.println("Palun sisestage ristküliku ühe külje pikkus: ");
		Scanner input2 = new Scanner(System.in);
		
		double b = input2.nextInt();
		
		System.out.println("Palun sisestage ristküliku teise külje pikkus: ");
		Scanner input3 = new Scanner(System.in);
		
		double c = input3.nextInt();
		
        System.out.println("Ruudu pindala on: " + f.ruutpindala(a) + " ja ümbermõõt on: " + f.ruutymberm66t(a));
        System.out.println("Ristküliku pindala on: " + r.ristkulikpindala(b,c) + " ja ümbermõõt on: " + r.ristkulikymberm66t(b,c));

    }
}