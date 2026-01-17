interface IVehicle {
    public void startEngine();
    public void stopEngine();
}

interface ITwoWheelerWithoutGear extends IVehicle {
}

interface ITwoWheelerWithGear extends IVehicle {
    public void applyFirstGear();
}

interface IFourWheeler extends IVehicle {
    public void applyFirstGear();
    public void applyReverseGear();
}

class Scooter{
    public void startEngine(){
        System.out.println("Scooter Engine Started");
    }
    public void stopEngine(){
        System.out.println("Scooter Engine Stopped");
    }
}

class RoyalEnfield{
    public void startEngine(){
        System.out.println("Bullet Engine Started");
    }
    public void stopEngine(){
        System.out.println("Bullet Engine Stopped");
    }
    public void applyFirstGear(){
        System.out.println("Shifted to 1st Gear");
    }
}

class XUV300{
    public void startEngine(){
        System.out.println("Car Engine Started");
    }
    public void stopEngine(){
        System.out.println("Car Engine Stopped");
    }
    public void applyFirstGear(){
        System.out.println("Shifted to 1st Gear");
    }
    public void applyReverseGear(){
        System.out.println("Shifted to Reverse Gear");
    }
}
public class LISKOVandS {
    public static void main(String[] args) {
        Scooter s1 = new Scooter();
        RoyalEnfield b1= new RoyalEnfield();
        XUV300 c1= new XUV300();
        s1.startEngine();
        s1.stopEngine();
        b1.startEngine();;
        b1.stopEngine();
        b1.applyFirstGear();
        c1.startEngine();
        c1.stopEngine();
        c1.applyFirstGear();
        c1.applyReverseGear();
    }
}
