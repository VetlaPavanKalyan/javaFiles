import java.util.*;

public class week8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] e=new Employee[n];
        for(int i=0;i<n;i++){
            e[i]=new Employee();
            e[i].setId(sc.nextInt());
            e[i].setName(sc.next());
            e[i].setAge(sc.nextInt());
        }
        HashMap<Integer,Employee> h =new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(e[i].getId(),e[i]);
        }
        int j=sc.nextInt();
        for(int i:h.keySet()){
            Employee p = h.get(i);
            if(i==j){
                System.out.println(p.getName()+p.getAge());
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
    static class Employee{
        private String name;
        private int id;
        private int age;
        void setId(int id){
            this.id=id;
        }
        void setAge(int age){
            this.age=age;
        }
        void setName(String name){
            this.name=name;
        }
        int getId(){
            return id;
        }
        int getAge(){
            return age;
        }
        String getName(){
            return name;
        }
    }
}
