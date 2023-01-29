/*
    Write a program to create interface A in this interface we have two method meth1 and meth2.
     Implements this interface in another class named MyClass.
 */
//Bhupendra Patel
interface A{
    void meth1();
    void meth2();
}
public class p1 implements A{
    @Override
    public void meth1() {
        System.out.println("Meth1 implemented");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 implemented");
    }

    public static void main(String[] args) {
        p1 ob = new p1();
        ob.meth1();
        ob.meth2();
    }
}
