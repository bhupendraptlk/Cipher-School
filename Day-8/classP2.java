import java.util.Arrays;
import java.util.stream.Stream;

class Employee{
    String name;
    public Employee(String name){
        this.name=name;
    }
}
public class classP2 {
    public static void main(String[] args) {
        Employee ob1 = new Employee("B");
        Employee ob2 = new Employee("Hope");
        Employee ob3 = new Employee("X");
        Employee ob4 = new Employee("Dark");
//        Employee[] emps = new Employee[]{ob1,ob2,ob3,ob4};
        Stream<Employee> emp = Stream.of(ob1,ob2,ob3,ob4);
        emp.forEach(ele-> System.out.println(ele.name));
    }
}
