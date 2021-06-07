package observer2.tasrobservers;

import observer2.Observer;
import observer2.Tasr;

public class FbGate extends Observer {

    public FbGate(Tasr subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("FB gate: "+ subject.getMessage());
    }

    public void remove(){
        subject.remove(this);
    }
}
