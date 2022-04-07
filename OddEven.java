import java.util.*;
public class OddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("This No Is Even");
        }
        else
            System.out.println("This No Is Odd");
    }
}
