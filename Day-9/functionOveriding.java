import java.util.Scanner;

abstract class Doctor{
    abstract  void treat();
}
class Physician extends Doctor{
    public void treat(){
        System.out.println("I treat patients with Medicine");
    }
}
class Surgeon extends Doctor{
    public void treat(){
        System.out.println("I treat patients with surgery");
    }
}
class Dentist extends Doctor{
    public void treat(){
        System.out.println("I treat patients Teeth");
    }
}
public class functionOveriding {
    public static void main(String[] args) {
        Doctor doc = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Physician, 2-Surgeon, 3-Dentist");
        int choice = scan.nextInt();
        if(choice==1) doc= new Physician();
        else if(choice==2) doc=new Surgeon();
        else if(choice==3) doc=new Dentist();
        doc.treat();
    }
}
