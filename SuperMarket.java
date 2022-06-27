import java.util.Scanner;


public class SuperMarket {
    public static void main(String[] args) {
        String itemno, name, cid, cname, address, phno;
        double price;
        int qty;
        System.out.println("Enter Product Details : 1.Id, 2.Name, 3.Price, 4.Qty");
        Scanner sc = new Scanner(System.in);
        itemno = sc.next();
        name = sc.next();
        price = sc.nextDouble();
        qty = sc.nextInt();
        System.out.println("Enter Customer Details : 1.Id, 2.Name, 3.Address, 4.Phone Number");
        cid = sc.next();
        cname = sc.next();
        address = sc.nextLine();
        phno = sc.next();
        Product p = new Product(itemno, name, price, qty);
        System.out.println("Item No. = " + p.getItem_no());
        System.out.println("Product Name = " + p.getName());
        System.out.println("Product Price = " + p.getPrice());
        System.out.println("Quantity = " + p.getQty());
        Customer c = new Customer(cid, cname, address, phno);
        System.out.println("Customer Id = " + c.c_id);
        System.out.println("Customer Name = " + c.c_name);
        System.out.println("Customer Address = " + c.address);
        System.out.println("Customer Phone Number = " + c.ph_no);
        System.out.println("Change your Product Price and Quantity : ");
        price = sc.nextDouble();
        qty = sc.nextInt();
        p.setPrice(price);
        p.setQty(qty);
        System.out.println("Changed Details are : ");
        System.out.println("Item No. = " + p.getItem_no());
        System.out.println("Product Name = " + p.getName());
        System.out.println("Product Price = " + p.getPrice());
        System.out.println("Quantity = " + p.getQty());
        System.out.println("Change your Customer Address and Phone Number : ");
        address = sc.nextLine();
        phno = sc.next();
        c.setAddress(address);
        c.setPh_no(phno);
        System.out.println("Changed Details are : ");
        System.out.println("Customer Id = " + c.getC_id());
        System.out.println("Customer Name = " + c.getC_name());
        System.out.println("Customer Address = " + c.getAddress());
        System.out.println("Customer Phone Number = " + c.getPh_no());
    }

    static class Customer {
        String c_id, c_name, address, ph_no;

//        public Customer(String c_id, String c_name) {
//            this.c_id = c_id;
//            this.c_name = c_name;
//        }

        public Customer(String c_id, String c_name, String address, String ph_no) {
            this.c_name = c_name;
            this.c_id = c_id;
            this.address = address;
            this.ph_no = ph_no;
        }

        String getC_id() {
            return c_id;
        }

        String getC_name() {
            return c_name;
        }

        String getAddress() {
            return address;
        }

        String getPh_no() {
            return ph_no;
        }

        void setAddress(String address) {
            this.address = address;
        }

        void setPh_no(String ph_no) {
            this.ph_no = ph_no;
        }
    }

    static class Product {
        String item_no, name;
        double price;
        int qty;

//        public Product(String item_no, String name) {
//            this.item_no = item_no;
//            this.name = name;
//        }

        public Product(String item_no, String name, double price, int qty) {
            this.item_no = item_no;
            this.name = name;
            this.price = price;
            this.qty = qty;
        }

        String getItem_no() {
            return item_no;
        }

        String getName() {
            return name;
        }

        double getPrice() {
            return price;
        }

        int getQty() {
            return qty;
        }

        void setPrice(double price) {
            this.price = price;
        }

        void setQty(int qty) {
            this.qty = qty;
        }
    }
}