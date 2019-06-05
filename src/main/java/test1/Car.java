package test1;

public class Car {
    String name;
    int speed;

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;


    }
}
