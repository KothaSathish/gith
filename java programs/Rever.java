import java.util.*;
class Rever{
 public static void main(String[] args){
 
 String str="sathishcharykotha";
  int len =str.length()-1;
  try{
 for(int i=len;i>0;i--) {
  
 System.out.print(str.charAt(i));

}

 }
catch(Exception e)
{
System.out.println("Error");
}
}
}