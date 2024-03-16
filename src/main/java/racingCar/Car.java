package racingCar;

public class Car {
    private String name;
    public Position position;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void move() {
        this.position.addPosition();
    }

    public String getName() {
        return name;
    }
}
