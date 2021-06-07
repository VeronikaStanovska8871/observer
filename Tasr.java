package observer2;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> observers = new ArrayList<Observer>();;
    private String message;
    private int priority;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message, int priority) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void attach(Observer observer){
        if (observer == null)
            return;
        if ((observers == null))
            observers = new ArrayList<>();
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public int getPriority() {
        return priority;
    }
}
