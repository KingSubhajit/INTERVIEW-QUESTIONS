import java.util.*;
public class Primeno {
    public static boolean prime(int n){
        if(n<=1)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0){
            return false;
        }
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(prime(n))
            System.out.println("Prime");
        else
            System.out.println("not prime");

    }
}
