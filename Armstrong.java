import java.util.*;
public class Armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int t=n;
        int r;
        int a =0;
        while(n>0){
            r=n%10;
            a= a+r*r*r;
            n=n/10;
        }
        if(a==t)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
