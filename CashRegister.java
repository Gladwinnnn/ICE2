public class CashRegister{
    private double purchase;
    private double payment;

    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void registerPurchase(double amount){
        purchase += amount;
    }

    public void makePayment(int dollars, int cents){
        payment = dollars * 100 + cents;
    }

    public double getPurchaseAmt(){
        return purchase;
    }

    public double giveChange(){
        return payment/100 - purchase;
    }
}