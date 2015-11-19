class PrintDemo{
    int [] arr = new int[] {1,2,3,4,5,6};
 void Dem(){
 for(int i =0;i<arr.length;i++){
 System.out.print("  "+arr[i]);
 }   
}

}
class PrintArray{
 public static void main(String[] args){
 
  PrintDemo pd = new PrintDemo(); 
          pd.Dem();
 //System.out.print(arr[4]);


}



} 