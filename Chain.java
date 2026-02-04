class A {
    A() {
        System.out.println("A class constructor");
    }
}

class B extends A {
    B() {
        super();   // valid call
        super();   //  ERROR: super() cannot be called twice
        System.out.println("B class constructor");
    }
}

public class Chain {
    public static void main(String[] args) {
        B obj = new B();
    }
}
