import java.util.Scanner;
public class ArrayAvgTot{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
     for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>  arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int avg=sum/n;
        System.out.println(avg);
        System.out.println(sum);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[n-1]);
        System.out.print(arr[n-2]);
    }
}