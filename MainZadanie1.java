import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2011));
        cars.add(new Car("Honda", 2013));
        cars.add(new Car("Ford", 2016));
        cars.add(new Car("BMW", 20010));
        cars.add(new Car("Audi", 2012));
        cars.add(new Car("Chevrolet", 2014));
        cars.add(new Car("Kia", 2009));
        cars.add(new Car("Mazda", 2015));
        cars.add(new Car("Hyundai", 2016));
        cars.add(new Car("Nissan", 2008));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
