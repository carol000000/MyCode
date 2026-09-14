//ac
//long k[][]= new long[n][3]; 用int超出最大
import java.util.Scanner;
public class a244 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k[][]= new long[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                k[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            if(k[i][0]==1){
                System.out.println(k[i][1]+k[i][2]);
            }
            if(k[i][0]==2){
                System.out.println(k[i][1]-k[i][2]);
            }
            if(k[i][0]==3){
                System.out.println(k[i][1]*k[i][2]);
            }
            if(k[i][0]==4){
                System.out.println(k[i][1]/k[i][2]);
            }
        }
    }
}
