public class week5a {
    public static void main(String[] args) {
        cost c = new cost("Sedan", "Audi", 40480000);
        c.vehicleInfo();
        c.brandInfo();
        c.costInfo();
    }
}

class vehicleType {
    String vname;

    vehicleType(String type) {
        vname = type;
    }

    void vehicleInfo() {
        System.out.println("Vehicle Name :" + vname);
    }
}

class brandType extends vehicleType {
    String bname;

    brandType(String type, String brand) {
        super(type);
        bname = brand;
    }

    void brandInfo() {
        System.out.println("Brand Info :" + bname);
    }
}

class cost extends brandType {
    int cost;

    cost(String type, String brand, int cost) {
        super(type, brand);
        this.cost = cost;
    }

    void costInfo() {
        System.out.println("cost :" + cost);
    }
}