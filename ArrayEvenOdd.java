import java.util.Scanner;
public class ArrayEvenOdd{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sumEven=sumEven+arr[i];
            }else{
                sumOdd=sumOdd+arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}