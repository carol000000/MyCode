//####################################
/* 
輸出都F 沒加break 找到後繼續往下到最後一個
import java.util.Scanner;
public class e283{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       // while(sc.hasNext()){
            int n = sc.nextInt(); //幾個
            String b [] = new String[n];
            for(int i=0;i<n;i++){
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                int a4 = sc.nextInt();
                int x = a1*1000+a2*100+a3*10+a4;
                switch(x){
                    case 101:
                        b[i]="A";
                    case 111:
                        b[i]="B";
                    case 10:
                        b[i]="C";
                    case 1101:
                        b[i]="D";
                    case 1000:
                        b[i]="E";
                    case 1100:
                        b[i]="F";
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
//}
*/
//######################################
/*
TLE 66%
import java.util.Scanner;
public class e283{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); //幾個
            String b [] = new String[n];
            for(int i=0;i<n;i++){
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                int a4 = sc.nextInt();
                int x = a1*1000+a2*100+a3*10+a4;
                switch(x){
                    case 101:
                        b[i]="A";
                        break;
                    case 111:
                        b[i]="B";
                        break;
                    case 10:
                        b[i]="C";
                        break;
                    case 1101:
                        b[i]="D";
                        break;
                    case 1000:
                        b[i]="E";
                        break;
                    case 1100:
                        b[i]="F";
                        break;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
} */
//#############################
/*
TLE 66%
import java.util.Scanner;
public class e283{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); //幾個
            String b [] = new String[n];
            for(int i=0;i<n;i++){
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                int a4 = sc.nextInt();
                int x = a1*1000+a2*100+a3*10+a4;
                if(x<120){
                    if(x==10){
                        b[i]="C";
                    }if(x==101){
                        b[i]="A";
                    }if(x==111){b[i]="B";}
                }
                else{
                    if(x==1101){
                        b[i]="D";
                    }if(x==1000){
                        b[i]="E";
                    }if(x==1100){b[i]="F";}

                }
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
}
*/