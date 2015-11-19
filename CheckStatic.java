class CheckStaticDemo{
 static void add(){
  int a=1;
  int b=4;
 int c=a+b;
System.out.println("c value is "+c);
}
}
public class CheckStatic extends CheckStaticDemo{

void add(){
 System.out.println("static overriden");
}
public static void main(String [] args){

CheckStatic ch =new CheckStatic();

    ch.add();
}
}