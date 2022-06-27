public class week3a {
    public static void main(String[] args) {
        Box b = new Box(12.5, 15.5, 9.5);
        System.out.println("Volume of the given Dimensions is : " + b.volume());
    }

    public static class Box {
        double height, length, breadth;

        Box(double l, double b, double h) {
            length = l;
            breadth = b;
            height = h;
        }

        double volume() {
            return length * breadth * height;
        }
    }
}
