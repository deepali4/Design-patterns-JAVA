package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    float temperature ;
    List<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers)
            observer.update(temperature);
    }
}
