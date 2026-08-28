import java.util.Scanner;
public class aaae {
    static int lengthx=10;
    static int lengthy=10;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //int x =sc.nextInt();
        //int y =sc.nextInt();
        //boolean [][]a = new boolean[10][10];
         boolean[][] a = {
    {false, true,  true,  false, false, false, true,  false, false, false},
    {false, false, true,  false, true,  false, true,  false, true,  false},
    {true,  false, false, false, true,  false, false, false, true,  false},
    {false, false, true,  true,  true,  false, true,  false, false, false},
    {true,  false, false, false, false, false, true,  true,  true,  false},
    {false, false, true,  false, true,  false, false, false, true,  false},
    {false, true,  true,  false, true,  true,  false, true, false, false},
    {false, false, false, false, false, true,  false, true, true,  false},
    {true,  true,  false, true,  false, false, false, false, false, false},
    {false, false, false, true, false, false, true,  false, false, false}
};
         m(a,0,0);
    }
    public static void m(boolean a[][],int i,int j){
        System.out.println("目前位置：" + i + "," + j);
        if(i+1<lengthx && a[i+1][j] != true){
            a[i+1][j]=true;
            System.out.println("下");
            m(a, i + 1, j);
            
         }
         else if(i-1>0 && a[i-1][j] != true){
            a[i-1][j]=true;
            System.out.println("上");
            m(a, i - 1, j);
            
         }
         else if(j+1<lengthy && a[i][j+1] != true){
            a[i][j+1]=true;
            System.out.println("右");
            m(a, i, j + 1);
            
         }
         else if(j-1>0 && a[i][j-1] != true){
            a[i][j-1]=true;
            System.out.println("左");
            m(a, i, j - 1);
            
         }
         System.out.println("return");
         return;
    }
    
}