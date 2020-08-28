import java.util.*;

public class CashRegisterTest{
    public static void main(String[] args){
        CashRegister cashRegister = new CashRegister();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of first item: $");
        cashRegister.registerPurchase(scanner.nextDouble());
        System.out.print("Enter the price of second item: $");
        cashRegister.registerPurchase(scanner.nextDouble());
        System.out.print("Enter dollars received from customer: ");
        int dollars = scanner.nextInt();
        System.out.print("Enter cents received from customer: ");
        int cents = scanner.nextInt();
        cashRegister.makePayment(dollars,cents);
        System.out.println("Total cost of purchase: $" + cashRegister.getPurchaseAmt());
        System.out.println("Change due: $" + cashRegister.giveChange());
    }
}