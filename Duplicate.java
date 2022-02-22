import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
        }
    }
    int count=0;
    for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                }
            }
    }
    
        int z= n-count;
        int[] Dup = new int[z];
        int i=0;
        int j=0;
        while(i<n-1 && j<z){
            if(arr[i]==arr[i+1]){
                Dup[j]=arr[i];
                i=i+2;
                j=j+1;
            }else{
                Dup[j]=arr[i];
                i=i+1;
                j=j+1;
            }
        }
        j=0;
        while(j<z){
            System.out.print(Dup[j] + " ");
            j++;
        }
        
    }
}
        
                
        
        
       