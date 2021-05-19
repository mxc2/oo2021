public class Pendel {
    double Vonkeperiood;
    int Paus;
	
    public Pendel(double pikkus,Hammasratas Hammasratas) throws InterruptedException {
        Vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
        Paus = (int) Vonkeperiood * 1000;
		
		//Pendli liikumine
        for(int i = 0; i<5; i++){
            System.out.println("Tik");
            Thread.sleep(Paus);
            Hammasratas.MoveForward();
            System.out.println("Tak");
            Thread.sleep(Paus);
            Hammasratas.MoveForward();
        }
    }
}