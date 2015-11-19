private class Modifiers{
 void modifiers(){
System.out.println("public class ");
 }
}
class CheckModifiers extends Modifiers{
 CheckModifiers ch = new CheckModifiers();
public static void main(String [] args){
System.out.println("java modifiers");
 ch.modifiers();


}

}