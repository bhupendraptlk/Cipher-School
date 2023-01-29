/*
    Write a program to create interface named test. In this interface the member function is square.
    Implement this interface in arithmetic class.
    Create one new class called ToTestInt in this class use the object of arithmetic class.
 */
//Bhupendra Patel
interface test{
    int square(int a);
}
class Arithmetic implements test{
    @Override
    public int square(int num) {
        return num*num;
    }
}
public class p2 extends Arithmetic{
    public static void main(String[] args) {
        p2 ob = new p2();
        System.out.println(ob.square(10));
    }
}
