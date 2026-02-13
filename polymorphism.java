class A 
{
    int sum(int a, int b)
    {
        return a + b;
    }

    int sum(int a, int b, int c)
    {
        return a + b + c;
    }
}

class B extends A
{
    @Override
    int sum (int a , int b)
    {
        return a+b;
    }
    void show()
    {
        System.out.println("Sum of 2 numbers: " + super.sum(2, 3));
        System.out.println("Sum of 2 numbers from child class: " + this.sum(2, 3));
        System.out.println("Sum of 3 numbers: " + super.sum(2, 3, 4));
    }
}

public class polymorphism
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}
