import java.util.*;
public class Swapping3rdVar {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt(), b= sc.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a+" "+b);
    }
}
