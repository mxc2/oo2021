public class Main{
    public static void main(String[] arg){
		System.out.println("Tere tulemast netopalga kalkulaatorisse. \n");
		
        Palk worker1 = new Palk("Tiit", 1150);
        Palk worker2 = new Palk("Toomas", 960);

        System.out.println((worker1.NetoKalkulaator()) + " eurot. \n");
        System.out.println((worker2.NetoKalkulaator()) + " eurot. \n");
    }
}
