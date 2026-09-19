import java.util.Scanner;
public class c461 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextInt() !=0;
        boolean b = sc.nextInt() !=0;
        boolean c = sc.nextInt() !=0;
        boolean found = false;
        if((a&b)==c){
            System.out.println("AND");
            found = true;
        }
        if((a|b)==c){
            System.out.println("OR");
            found=true;
        }
        if((a^b)==c){
            System.out.println("XOR");
            found=true;
        }
        if(found!=true){
            System.out.println("IMPOSSIBLE");
        }
    }
}
