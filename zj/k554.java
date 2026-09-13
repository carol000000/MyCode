//ac
import java.util.Scanner;
public class k554 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nm[][] = new int[n][m];
        int x[][] = new int[n][m];
        //輸入
        for(int i=0;i<n;i++ ){
            for(int j=0;j<m;j++){
                nm[i][j]=sc.nextInt();
                x[i][j]=0;
            }
        }
        //ij i
        //ij i+1,j,上; i-1,j,下; i,j+1,右; i,j-1左
        for(int i=0;i<n;i++ ){
            for(int j=0;j<m;j++){
                if(nm[i][j]==0){
                    continue;
                }else if(nm[i][j]==1){
                    x[i][j]+=1;
                    if(j-1>=0){
                        x[i][j-1]+=1;
                    }
                    if(j+1<m){
                        x[i][j+1]+=1;
                    }
                    if(i+1<n){
                        x[i+1][j]+=1;
                    }
                    if(i-1>=0){
                        x[i-1][j]+=1;
                    }
                }else{
                    //左j-0; 右m-j; 上i-0; 下n-i
                    x[i][j]+=1;
                    for(int t=j-1;t>=0;t--){
                        x[i][t]+=1;
                    }
                    for(int t=j+1;t<m;t++){
                        x[i][t]+=1;
                        
                    }
                    for(int t =i-1;t>=0;t--){
                        x[t][j]+=1;
                    }
                    for(int t = i+1;t<n;t++){
                        x[t][j]+=1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(x[i][j]+" ");

            }
            System.out.println();
        }

    }
}
