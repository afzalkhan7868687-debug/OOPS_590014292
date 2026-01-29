class Student {
    int age;
    String name;

    void showAge() {
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "Afzal";
        s1.showAge();
    }
}
