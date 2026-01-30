class Car2 {
    int price;
}

class BMW extends Car2 {
    BMW() {
        price = 100000;
    }

    void display() {
        System.out.println("BMW Price: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.display();
    }
}
