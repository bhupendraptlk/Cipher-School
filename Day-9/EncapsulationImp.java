//Encapsulation is the capability of defining the access of class members
//Encapsulation help us expose data members and methods to the right level of security
//Encapsulation is practiced by using access modifiers, getters and setters.
class PhonePay{
    private float serviceCharge = 0.05f;
    float getServiceCharge(){
        return serviceCharge;
    }
    void setServiceCharge(float newCharge){
        if(newCharge<serviceCharge){
            System.out.println("The new service charge cannot be lesser than the default service  charge");
            return ;
        }
        serviceCharge=newCharge;
    }
}
class Customer{
    void pay(int bill){
        PhonePay phonePay = new PhonePay();
        phonePay.setServiceCharge(0.01f);
        float phonePayCharge = bill*phonePay.getServiceCharge();
        float finalAmount = phonePayCharge+bill;
        System.out.println(String.format("Bill %s , phonePay service charge %s, final Amount %s",bill,phonePayCharge,finalAmount));
    }
}
public class EncapsulationImp {
    public static void main(String[] args) {
        Customer ob = new Customer();
        ob.pay(400);
    }
}
