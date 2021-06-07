package observer2;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> observers = new ArrayList<Observer>();;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
