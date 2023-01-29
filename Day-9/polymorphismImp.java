/*

Polymorphism is the capability of an Object to exist in multiple forms

Types of polymorphisms:
    Static:When the function call is known at Compile Time
                Implemented using function overloading
    Dynamic (Runtime) polymorphism :When the function call is determined at runtime
              Implemented using function overRiding

    Function Overloading is defining multiple functions with same function name but with different parameters

*/
public class polymorphismImp {
    void add(int a,int b){
        System.out.println((a+b));
    }
    void add(int a,float b){
        System.out.println((a+b));
    }
    void add(float a,float b){
        System.out.println((a+b));
    }
    void add(double a,float b){
        System.out.println((a+b));
    }
    void add(float a,double b){
        System.out.println((a+b));
    }
    public static void main(String[] args) {
        polymorphismImp ob = new polymorphismImp();
        ob.add(100.0f,15.0);
    }
}
