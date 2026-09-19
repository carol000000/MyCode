import java.util.Scanner;
public class d485{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a==b){
            if(a%2==0){
                 System.out.println("1");
            }else{
                 System.out.println("0");
            }
        }
        else if(((b-a)+1)%2==0){ //看有機個數字奇偶
            System.out.println(((b-a)+1)/2); 
        }else{
            if(a%2!=0){
                System.out.println(((b-a)+1)/2);
            }else{
               System.out.println((((b-a)+1)/2)+1); 
            }
        }

    }
}

/* 
//TLE
int c =0;
        while(a<=b){
            if(a%2==0){
                c++;
                a++;
            }else{
            a++;
            }
        }
        System.out.println(c);
*/
/*
na 70%
if((((b-a)/2)+1)%2==0){
            System.out.println(((b-a)+1)/2);
        }else{
            if(a%2!=0){
                System.out.println(((b-a)+1)/2);
            }else{
               System.out.println((((b-a)+1)/2)+1); 
            }
        }
*/
//a=0 b=int最大 (b-a)+1 會溢位
//(b-a)+1) 有幾個數字
// 奇1偶0 如果有奇數個數字 可能出現 10101 或 01010
    