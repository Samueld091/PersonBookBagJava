package things;

import java.util.Random;

public class Phone {
    private String number;
    private double price;

    public Phone(String number) {
        this.number = number;

        Random random = new Random();

        price = 150 + random.nextInt(1450 - 150) + random.nextDouble();
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo()
    {
        System.out.printf("Type-> Phone->\t\t %s\t\t\t\t\tPrice: %7.2f\n", number, price);
    }
}
