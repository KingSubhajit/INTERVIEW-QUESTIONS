import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int t =n;
        int r =0;
        while(n>0){
            r=(r*10)+(n%10);
            n= n/10;
        }
        if(r==t){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Non Palindrome");
    }
}
