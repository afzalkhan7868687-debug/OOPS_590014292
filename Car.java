import java.util.Scanner;

class Car {
    int modelYear;
    int mileage;

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter model year of car 1: ");
        c1.modelYear = s.nextInt();

        System.out.print("Enter model year of car 2: ");
        c2.modelYear = s.nextInt();

        s.close();
    }
}
