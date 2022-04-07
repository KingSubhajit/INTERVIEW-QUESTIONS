import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String c="";
        for(int i=s.length()-1;i>=0;i--){

            c=c+s.charAt(i);

        }
        System.out.print(c);
    }
}
