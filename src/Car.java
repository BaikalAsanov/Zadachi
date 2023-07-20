import java.util.Arrays;

public class Car {
    private String Model;
    private char Class;
    private Driver driver;
    private String  color;

    public Car(String model, char aClass, Driver driver, String color) {
        Model = model;
        Class = aClass;
        this.driver = driver;
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
    public char getClass(char Class) {
        return Class;
    }

    public void setClass(char aClass) {
        Class = aClass;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String  Mehods(String actions) {
            if (actions.equalsIgnoreCase("start")) {
                return "Поехали!!!";
            } else if (actions.equalsIgnoreCase("stop")) {
                return "Останавливаемся.";
            } else if (actions.equalsIgnoreCase("Turn Left")) {
                return "Поворот налево.";
            } else if (actions.equalsIgnoreCase("Turn Right")) {
                return "Поворот направо.";
            } else {
                return "Такой команды нет.";
            }
        }
    @Override
    public String toString() {
        return "{"+"Model: "+Model+", "+
                "Class: "+Class+", "+
                "Driver: "+ driver+", "+
                "Color: "+color+"}";
    }
}
