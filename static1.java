import java.util.Scanner;

class static1 {
    // static int n;
    int n;
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        static1 m = new static1();
        // int n;
        m.n = s.nextInt();
        // n = s.nextInt();
        // System.out.print(n);
        System.out.print(m.n);
    }
}
