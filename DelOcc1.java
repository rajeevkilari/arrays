  import java.util.Scanner;
  public class DelOcc1{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int n=s.nextInt();
  int x=s.nextInt();
  int arr[]=new int[n];
  int arr1[]=new int[n-1];
      for(int i=0;i<n;i++){
     arr[i]=s.nextInt();
  if(x==arr[i]){
       x=Integer.MIN_VALUE;
      arr[i]=Integer.MIN_VALUE;
    }
        }
        int i=0;
 int j=0;
   while(i<n && j<n-1){
   if(x==arr[i]){
       i=i+1;
        }else{
    arr1[j]=arr[i];
         j=j+1;
            i=i+1;
          }
        }
       for(int k=0;k<n-1;k++){
    System.out.print(arr1[k] + " ");
   }
    }
}
    

