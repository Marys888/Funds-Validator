package app;

public class BalanceHandler {
    private double initialBalance;
    public BalanceHandler(double initialBalance){
        this.initialBalance = initialBalance;
    }

    public double getBalance(){
        return  initialBalance;
    }
    public void purchase(double amount){
        if(amount > initialBalance) {
            throw new FundsException("Insufficient funds!");
        }
        initialBalance-= amount;
    }
}
