public class basics {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter your age, salary, height and name");
        int age = scan.nextInt();
        double salary = scan.nextDouble();
        float height = scan.nextFloat();
        String name = scan.next();
        String display = String.format("Hey %s, your age is %d and salary is %f while your height is %f.",name,age,salary,height);
        System.out.println(display);
    }
}
