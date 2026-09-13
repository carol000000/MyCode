//wa 要用dp
import java.util.Scanner;
public class d904{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // money
        int n = sc.nextInt(); //硬幣
        int c[] = new int[n];
        int y=0;
        //輸入硬幣種類
        for(int i = 0;i<n;i++){
            int d = sc.nextInt();
            c[i]=d;
        }
        if(a<=0){
            System.out.println("0");
        }
        else{
            //排序
            for(int j = 0;j<n;j++){
                for(int u = 0;u<n-1-j;u++){
                    if(c[j]<c[j+1]){
                        int m = c[j+1];
                        c[j+1]=c[j];
                        c[j]=m;
                    }
                }
            }
            for(int k = 0 ;k<n;k++){
                if(a>c[k]){
                    int s = a/c[k]; //算第k的n友幾個
                    y+=s; //記硬幣數量
                    a =a%c[k]; //算剩餘的
                }
                else{
                    y+=1;
                    break;
                }
            }
            System.out.println(y);
        }
    }
}