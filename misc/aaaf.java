//回文 
import java.util.Scanner;
public class aaaf{
    public static void main(String []args){
        boolean f = true;
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        if(a<0){
            f = false;
        }
        else{
            int b = 0 ;
            int n = a ;
            while(n>0){
                int v = n;
                n = v/10;
                b++;
            }
            int m[] = new int[b];
            int i,z,d;
            int x = a;
            int g = b/2;
            for(i=0;i<b;i++){
                z = x % 10;
                m[i]=z;
                x = x/10;
            }
            for(d=0;d<g;d++){
                if(m[d]!=m[b-1-d]){
                    f = false;
                    break;
                }    
            }
        }
        if(f==false){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}