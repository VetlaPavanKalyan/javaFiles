package MyPackage1;
public class Student{
    String name,rollNo;
    Student(String name,String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void studentDetails(){
        System.out.println("Student Name is "+name+" and his Roll Number is "+rollNo);
    }
}