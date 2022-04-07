import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int a = 0 , b =1;
        int c;
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        for(int i=2;i<n;++i){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
