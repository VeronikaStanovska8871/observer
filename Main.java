package observer2;

import observer2.tasrobservers.EmailGate;
import observer2.tasrobservers.FaxGate;
import observer2.tasrobservers.FbGate;
import observer2.tasrobservers.SMSGate;

public class Main {
    public static void main(String[] args) {
       Tasr tasr = new Tasr();
       EmailGate emial =  new EmailGate(tasr);
       FaxGate fax = new FaxGate(tasr);
       SMSGate sms = new SMSGate(tasr);
       FbGate fb = new FbGate(tasr);
       tasr.setMessage("Message",1);
       fax.remove();
       sms.remove();
       tasr.setMessage("Message 2",2);
       fax.remove();
       sms.remove();
       fb.remove();
       tasr.setMessage("Message 3",3);
    }
}
