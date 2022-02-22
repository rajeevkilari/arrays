import java.util.Scanner;
public class RemEle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                count=count+1;
            }
        }
     int z=n-count;
     int[] rem=new int[z];
     int i=0;
     int j=0;
     while(i<n && j<z){
         if(x==arr[i]){
             i=i+1;
         }else{
             rem[j]=arr[i];
             System.out.print(rem[j] + " ");
             i=i+1;
             j=j+1;
         }
        
     }
        
    }
}
        
        
        