import java.util.Scanner;
public class ArrayPrime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=2;i<m;i++){
        int div=2;
        int count=0;
        while(div<i){
            if(i%div==0){
                break;
            }else{
                div=div+1;
                count=count+1;
            }
        }
        if(count==i-2){
            for(int k=0;k<n;k++){
                arr[k]=i;
                System.out.print(arr[k] + " ");
                break;
            }
        }
        }
    }
    }
            