package pl.edu.wszib.car.rent.test;

import pl.edu.wszib.car.rent.gui.GUIInterface;
import pl.edu.wszib.car.rent.model.Car;

import java.util.List;

public class InterfejsTest implements GUIInterface {
    @Override
    public String showMenuAndReadChoice() {
        return "";
    }

    @Override
    public void listCars(List<Car> cars) {

    }

    @Override
    public String readPlate() {
        return "";
    }

    @Override
    public void showResultMessage(boolean result) {

    }
}
