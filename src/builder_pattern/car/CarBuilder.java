package builder_pattern.car;

public class CarBuilder implements CarBuilderInterface {


    private Car car;


    public CarBuilder() {
        car = new Car();
    }


    @Override
    public Car build() {
//        if (car.getType() == null)
//            throw new Exception("Car Type should be specify!");

        return car;
    }

    @Override
    public CarBuilderInterface setType(Car.Type type) {
        car.setType(type);
        return this;
    }

    @Override
    public CarBuilderInterface setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilderInterface setModel_name(String model_name) {
        car.setModel_name(model_name);
        return this;
    }

    @Override
    public CarBuilderInterface setFactory(String factory) {
        car.setFactory(factory);
        return this;
    }

    @Override
    public CarBuilderInterface setNumber_of_doors(int number_of_doors) {
        car.setNumber_of_doors(number_of_doors);
        return this;
    }
}
