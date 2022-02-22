import java.util.Scanner;
  public class InsertSpe{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int n=s.nextInt();
  int x=s.nextInt();
  int index=s.nextInt();
  int arr[]=new int[n];
  int arr1[]= new int[n+1];
  for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
  }
  int i=0;
  int j=0;
  while(i<n && j<n+1){
      if(i==index){
          arr1[j]=x;
          arr1[j+1]=arr[i];
          i=i+1;
          j=j+2;
      }else{
          arr1[j]=arr[i];
          i=i+1;
          j=j+1;
      }
  }
  for(int k=0;k<n+1;k++){
      System.out.print(arr1[k] + "  ");
  }
  }
  }