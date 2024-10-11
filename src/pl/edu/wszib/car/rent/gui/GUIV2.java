package pl.edu.wszib.car.rent.gui;

import pl.edu.wszib.car.rent.model.Car;

import java.util.List;
import java.util.Scanner;

public class GUIV2 implements GUIInterface {
    private Scanner scanner = new Scanner(System.in);
    private static final GUIV2 instance = new GUIV2();

    private GUIV2() {
    }

    public String showMenuAndReadChoice() {
        System.out.println("11. List cars");
        System.out.println("22. Rent car");
        System.out.println("33. Exit");

        return scanner.nextLine();
    }

    public void listCars(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car.getBrand() + " " +
                    car.getModel() + " " + car.getColor() + " " +
                    car.getYear() + " " + car.getPlate() + " " + car.isRent());
        }
    }

    public String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public void showResultMessage(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    public static GUIV2 getInstance() {
        return instance;
    }
}
