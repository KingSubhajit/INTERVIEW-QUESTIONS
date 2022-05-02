import java.util.*;
public class HowManyElementUnchanged {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k[] = new int [a.length];
        for(int i=0;i<n;i++){
            k[i]=a[i];
            System.out.print(k[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==k[i]){
                c++;
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
