package builder_pattern.car;

public interface CarBuilderInterface {

    public Car build();

    public CarBuilderInterface setType(Car.Type type);

    public CarBuilderInterface setColor(String color);

    public CarBuilderInterface setModel_name(String model_name);

    public CarBuilderInterface setFactory(String factory);

    public CarBuilderInterface setNumber_of_doors(int number_of_doors);

}
