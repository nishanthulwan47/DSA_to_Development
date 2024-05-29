package overriding;

class TV {

    public void switchON() {
        System.out.println("TV is Switched ON");
    }

    public boolean changeChannel() {
        System.out.println("TV Channel is changes");
        return false;
    }
}

class SmartTV extends TV {

    public void changeTV() {
        System.out.println("TV is Changed");
    }

    public void isTVWorking() {
        System.out.println("TV is working fine bitches");
    }
}

public class OverridingExample2 {

    public static void main(String[] args) {

        TV tv = new TV();

        TV t = new SmartTV();

        t.changeChannel();

        System.out.println(tv.changeChannel());
    }
}
