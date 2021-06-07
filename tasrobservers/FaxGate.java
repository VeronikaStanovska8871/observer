package observer2.tasrobservers;

import observer2.Observer;
import observer2.Tasr;

public class FaxGate extends Observer {
    public FaxGate(Tasr subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Fax Gate: " + subject.getMessage());
    }

    public void remove(){
        subject.remove(this);
    }
}
