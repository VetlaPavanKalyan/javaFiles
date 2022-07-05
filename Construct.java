class Employee {
    int id;
    double salary;
// just testing
    Employee() {
        id = 72;
        salary = 30000;
        System.out.println("ID : " + id + " & " + "SALARY : " + salary);
    }

    Employee(int eid, double salary) {
        this.id = eid;
        this.salary = salary;
        System.out.println("ID : " + id + " & " + "SALARY : " + salary);
    }
}

public class Construct {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(10, 420000);
    }
}
