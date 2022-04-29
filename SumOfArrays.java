
 public class SumOfArrays {
    
  public static void main(String[]args)
    
     {
         int sum=0;
     System.out.println("ARRAY");
     int arr[]={2,5,7,8};
  for(int i=0;i<arr.length;i++){
         System.out.println("Elements of array---->"+arr[i]);
  }
    for(int i=0;i<arr.length;i++){
    sum=sum+arr[i];}
    
    System.out.println("sum of array elements"+ "  "+sum);
}
}