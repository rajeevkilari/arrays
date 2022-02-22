import java.util.Scanner;
public class Search{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.print(i);
            }else{
                continue;
            }
        }
    }
}