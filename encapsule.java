public class encapsule {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("VETLA PAVAN KALYAN");
        System.out.println(p.getName());
    }

    public static class Person {
        private String name = "Sample";

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}


