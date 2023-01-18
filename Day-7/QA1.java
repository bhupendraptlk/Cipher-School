import java.util.stream.Stream;
public class QA1 {
    public static void main(String[] args) {
        Stream<String> employees = Stream.of("B","Sanidhya","Krish","Rohit","Z","abc","India");
        Stream<String> empVow = employees.filter(emp->emp.toUpperCase().startsWith("A") || emp.toUpperCase().startsWith("E") || emp.toUpperCase().startsWith("I") || emp.toUpperCase().startsWith("O") || emp.toUpperCase().startsWith("U"));
        empVow.forEach(emp-> System.out.println(emp));

        /*
        Stream<String> upperCaseName = employees.map(name->name.toUpperCase());
        upperCaseName.forEach(name->System.out.println(name));
         */
    }
}
