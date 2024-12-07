package Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureDisplay implements Observer{

    String name;

    public TemperatureDisplay(String name){
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " displays Temperature: " + temperature + " degrees Celsius");
    }
}
