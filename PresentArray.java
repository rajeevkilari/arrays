import java.util.Scanner;
public class PresentArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i=0;
        for(;i<n;i++){
            if(x==arr[i]){
                System.out.println("element is present");
                break;
            }
        }
        if(i==n){
            System.out.println("element is not present");
        }
    }
}
        