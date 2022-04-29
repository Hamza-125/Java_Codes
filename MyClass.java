public class MyClass {
    
     public static void main(String[]args)
    
     {
         int sum=0;
    System.out.println("ARRAY");
    int arr[]={2,5,7,8};
    for(int i=0;i<=3;i++){
        System.out.println("Elements of array---->"+arr[i]);
    }
    for (int i=0;i<=3;i++){
    sum=sum+arr[i];
   
  if(i==3){
      System.out.println("");
        System.out.println("sum of array elements"+ "  "+sum);
  }
    }
    
   }
}