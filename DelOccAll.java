import java.util.Scanner;
  public class DelOccAll{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int n=s.nextInt();
  int x=s.nextInt();
  int arr[]=new int[n];
  int count=0;
  for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
      if(x==arr[i]){
          count=count+1;
      }
  }
  int z=n-count;
  int arr1[]=new int[z];
  int i=0;
  int j=0;
  while(i<n && j<z){
      if(arr[i]==x){
          i=i+1;
      }else{
          arr1[j]=arr[i];
          i=i+1;
          j=j+1;
      }
  }
  j=0;
  while(j<z){
      System.out.print(arr1[j] + " ");
      j=j+1;
  }
  }
  }
  
  