public class BillCalculation {

    private double purchase , payment;

    public BillCalculation() {
        payment = 0;
        purchase = 0;
    }

    public void recordPurchase(double ammount) {
        purchase=purchase + ammount;
    }

    public void receivePayment(int dollars , int quaters , int dimes , int nickls , int pennies) {
        payment = dollars + quaters *
                 Constants.QUATER_VALUE + dimes *
                 Constants.DIMES_VALUE + nickls *
                 Constants.NICKLES_VALUE + pennies *
                 Constants.PENNIES_VALUE;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
