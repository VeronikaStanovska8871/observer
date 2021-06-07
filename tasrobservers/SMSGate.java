package observer2.tasrobservers;

import observer2.Observer;
import observer2.Tasr;

public class SMSGate extends Observer {
    public SMSGate(Tasr subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("SMS gate");
    }
}
