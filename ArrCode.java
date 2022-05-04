
class ArrCode {
    
    void att(){
        int arr[]={2,4,3,5};
        for(int i=0;i<=3;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        ArrCode b=new ArrCode();
        System.out.println("Elements of array");
        b.att();
    }
}