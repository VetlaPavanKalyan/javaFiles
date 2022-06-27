abstract class Device{
    int dId=5;
    String dName="Motorola";
    double dCost=21000.55;
    public abstract void deviceDetails();
}
class Details extends Device {
    public void deviceDetails(){
        System.out.println(dId+" "+dName+" "+dCost);
    }
}


public class abs extends Details{
    public static void main(String[] args) {
        Details d = new Details();
        d.deviceDetails();
    }
}
