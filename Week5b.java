public class Week5b {
    public static void main(String[] args) {
        Figure_3D[] Fig = new Figure_3D[3];
        Fig[0] = new Cylinder();
        Fig[1] = new Cone();
        Fig[2] = new Sphere();
        Fig[0].volume();
        Fig[0].area();
        Fig[1].volume();
        Fig[1].area();
        Fig[2].volume();
        Fig[2].area();
    }
}

class Figure_3D {
    final double p = Math.PI;
    double r = 12.3;
    double h = 34.5;
    double l = 10.5;
    double b = 15.7;

    void volume() {
        System.out.println("Volume of Figure is:");
    }

    void area() {
        System.out.println("Area of Figure is:");
    }
}

class Cylinder extends Figure_3D {
    void volume() {
        double vol = p * Math.pow(r, 2) * h;
        System.out.println("Volume of Cylinder is : " + vol);
    }

    void area() {
        double area = 2 * p * r * h;
        System.out.println("Area of the Cylinder is : " + area);
    }
}

class Cone extends Figure_3D {
    void volume() {
        double vol = (1.0 / 3.0) * p * Math.pow(r, 2) * h;
        System.out.println("Volume of Cone is : " + vol);
    }

    void area() {
        double area = 2 * p * r * l;
        System.out.println("Area of the Cone is : " + area);
    }
}

class Sphere extends Figure_3D {
    void volume() {
        double vol = (4.0 / 3.0) * p * Math.pow(r, 3);
        System.out.println("Volume of the Sphere is : " + vol);
    }

    void area() {
        double area = (4.0) * p * Math.pow(r, 2);
        System.out.println("Area of the Sphere is : " + area);
    }
}