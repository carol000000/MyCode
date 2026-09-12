public class Dinosaur {
    public static void main(String []args)throws InterruptedException{
        boolean runing = false;
        while (runing) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            Thread.sleep(100);
        }
        

    }
    
}
