// ac
import java.util.Scanner;
public class a104 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        int a = sc.nextInt();
        int m[]=new int[a];
        for(int i=0;i<a;i++){
            m[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                if(m[j]>m[j+1]){
                int p = m[j+1];
                m[j+1]=m[j];
                m[j]=p;
                }
            }
        }
       
        for(int i=0;i<a;i++){
            System.out.print(m[i]+" ");
            }
            System.out.println();
        }
    }
    
}
/*
EOF sc.hasNext();
*/