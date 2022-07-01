import interfaces.Ringinable;
import interfaces.Rustingable;

public class Pocket implements Rustingable,Ringinable{


    @Override
    public void ringing() {
        System.out.println("Something is ringing in left pocket");
    }

    @Override
    public void rustling() {
        System.out.println("Rustling something paper in the right pocket");

    }
}
