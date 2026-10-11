//ac
import java.util.Scanner;
public class c294 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                if(j==2){break;}
                if(a[j]>a[j+1]){
                    int nmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=nmp;
                }
            }
        }
        String msg;
        if(a[0]+a[1]<=a[2]){
            msg = "No";
        }else if(a[0]*a[0]+a[1]*a[1]<a[2]*a[2]){
            msg = "Obtuse";
        }else if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2]){
            msg = "Right";
        }else{
            msg = "Acute";
        }
        
        System.out.print(a[0]+" ");
        System.out.print(a[1]+" ");
        System.out.print(a[2]+"\n");
        System.out.print(msg);
    
    }
}


/*
import java.util.Scanner;
public class c294 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b<=c){
            System.out.println("No");
        }
        int cc = c*c;
        int ab =a*a+b*b;
        if(ab<cc){
            System.out.print(a+" ");
            System.out.print(b+" ");
            System.out.print(c+"\n");
            System.out.println("Obtuse");
        }else if(ab==cc){
            System.out.print(a+" ");
            System.out.print(b+" ");
            System.out.print(c+"\n");
            System.out.println("Right");
        }else{
            System.out.print(a+" ");
            System.out.print(b+" ");
            System.out.print(c+"\n");
            System.out.println("Acute");
        }

    }
    
}

*/