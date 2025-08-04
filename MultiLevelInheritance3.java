package Practical;

class Appliance {
    void turnOn() {
        System.out.println("Appliance turned ON.");
    }

    void turnOff() {
        System.out.println("Appliance turned OFF.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int level) {
        System.out.println("Ceiling fan speed set to level " + level);
    }
}

public class MultiLevelInheritance3 {
    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();
        cf.turnOn();      // From Appliance
        cf.rotate();      // From Fan
        cf.setSpeed(3);   // From CeilingFan
        cf.turnOff();
    }
}
