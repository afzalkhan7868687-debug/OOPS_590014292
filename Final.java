class A {
    final int var = 10;
    
    final void display() {   System.out.println("value of var : " + var);} }
final class B {
    static int var;
}
public class Final {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }


    
}
