public class test{
    public static void main(String[]args){
    System.out.println("Hello");
 for(int i=1;i<=50;i++)
    
    if(i%3==0 && i%5==0){
         System.out.println("TOM CAT");
     }
        else if(i%3==0){
         System.out.println("TOM");
     }
     else if(i%5==0){
         System.out.println("CAT");
     }
    
     else{
         System.out.println(i);
     }
    }
}