/* 
//還沒寫完
import java.util.Scanner;
public class e283 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
             int a = sc.nextInt();//有幾個
            String c[]=new String [a];
            int 
            for(int i=0;i<a;i++){
                int b = sc.nextInt();
                switch (b) {
                    case 0101:
                         c[i]="A";
                        continue;
                    case 0111:
                        c[i]="B";
                        continue;
                    case 0010:
                        c[i]="C";
                        continue;
                    case 1101:
                        c[i]="D";
                        continue;
                    case 1000:
                        c[i]="E";
                        continue;
                    case 1100:
                        c[i]="F";
                        continue;
                }
            }
            for(int i=0;i<a;i++){
                System.out.print(c[i]);
            }
            System.out.println();
         }
    }
}
    */