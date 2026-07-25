/*########
OOXX
#########*/
import java.util.Random;
import java.util.Scanner;
public class ooxx{
    static int playerScore = 0;
        static int playerSum = 0;
        static int botScore = 0;
        static int botSum = 0;
        static int sum = 0;
        static int tmp1 = 0;
        static int tmp2 = 0;
    public static void main (String []args){
        System.out.println("====OOXX====");
        System.out.println("00 | 01 | 02");
        System.out.println("------------");
        System.out.println("10 | 11 | 12");
        System.out.println("------------");
        System.out.println("20 | 21 | 22");
        //o=0;x=9
        int [][] ooxx ={{8,1,6},{3,5,7},{4,9,2}};
        while (true) {
            play(ooxx);
            if(playerScore == 15 && playerSum >=3){
                System.out.println("你贏了");
                break;
            }
            else if(botScore == 15 && botSum >=3){
                System.out.println("你輸了");
                break;
            }
            else if(sum >=9){
                System.out.println("平手");
                break;}
            else{
                System.out.println("==========");
                for(int f=0;f<3;f++){
                    System.out.println("\n--------");
                    for(int g=0;g<3;g++){
                        System.out.print("|");
                        
                        if(ooxx[f][g]==0){
                            System.out.print("O ");}
                        else if(ooxx[f][g]==9){
                            System.out.print("X ");}
                        else{
                            System.out.print("  ");}
                    }
                }
            }  
        }
    }
    public static void play(int[][] ooxx){
        System.out.println("\n輸入位置座標");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i =sc.nextInt();
        int j =sc.nextInt();
        if (ooxx[i][j]==0 || ooxx[i][j]==10){
                System.out.println("已經有人填了");
        }
        else{
            tmp1 = ooxx[i][j];
            playerScore += tmp1;
            ooxx [i][j] =0;
            playerSum +=1;
            sum+=1;
        while (true) {
            int m = random.nextInt(0,3);
            int n = random.nextInt(0,3);
            if(sum == 9){
                break;
            }
            if (ooxx[m][n]!=0 && ooxx[m][n]!=10){
                tmp2 = ooxx[m][n];
                botScore += tmp2;
                ooxx[m][n]=10;
                botSum +=1;
                sum+=1;
                break;
            }
        }
        System.out.println("雙方總步數"+sum);
        }
        return;
    }
}