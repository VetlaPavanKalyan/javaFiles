//interface abc {
//    default void show(){
//        System.out.println("Interface 1!!!");
//    }
//}
//interface def {
//    default void show() {
//        System.out.println("Interface 2!!!");
//    }
//}
//
//public class multiple implements abc, def {
//    public void show(){
//        abc.super.show();
//        def.super.show();
//    }
//    public static void main(String[] args) {
//        multiple m = new multiple();
//        m.show();
//    }
//}
interface abc {
    final double d=5.85;
    final int a=9;
    final String s="Naruto";
    void display();
}

public class multiple implements abc {
    public void display(){
        System.out.println("Interface!!!");
        System.out.println(d+a+s);
    }

    public static void main(String[] args) {
        multiple m = new multiple();
        m.display();
    }
}