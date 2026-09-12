//階乘

import  java.util.Scanner;
public class aaag {
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0){
            System.out.println("X");
        }
        else if(a==0){
            System.out.println("1");
        }
        else{
            abc(a);
            System.out.println(abc(a));
        }
        
    }
    public static int abc(int a){
        if(a==1){
            return 1; 
        }
        else{
        return (a*abc(a-1));
        }
    }
}