package builder_pattern.car;

public class Car {

    private Type type;
    private String color;
    private String model_name;
    private String factory;

    private int number_of_doors;


    public Car(Type type, String color, String model_name, String factory, int number_of_doors) {
        this.type = type;
        this.color = color;
        this.model_name = model_name;
        this.factory = factory;
        this.number_of_doors = number_of_doors;
    }


    public Car(){
    }

//    Setter
    public void setType(Type type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setNumber_of_doors(int number_of_doors) {
        this.number_of_doors = number_of_doors;
    }



//    Getters

    public Type getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getModel_name() {
        return model_name;
    }

    public String getFactory() {
        return factory;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }


    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color='" + color + '\'' +
                ", model_name='" + model_name + '\'' +
                ", factory='" + factory + '\'' +
                ", number_of_doors=" + number_of_doors +
                '}';
    }

    public enum Type {
        SUV,
        Sport,
        Van,
        Crossover

    }

}
