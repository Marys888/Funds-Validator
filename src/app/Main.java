package app;

public class Main {
    public static void main(String[] args) {
        AmountProvider amountProvider = new AmountProvider();
        BalanceHandler balance = new BalanceHandler(1000);
        double amount = amountProvider.getAmount();
        String initialBalanceMessage = "Balance is: " + "USD" + " " + balance.getBalance() + "\n";
        String promptMessage = "Enter purchase amount, USD: " + " " + amount + "\n";
        String successMessage = "Funds are OK. Purchase paid.";


        try{
            balance.purchase(amount);
            getOutput(initialBalanceMessage);
            getOutput(promptMessage);
            getOutput(successMessage);
            String updatedBalanceMessage = "Balance is: " + "USD" +" " + balance.getBalance() + "\n";
            getOutput(updatedBalanceMessage);
        }
        catch(FundsException e){
            getOutput(initialBalanceMessage);
            getOutput(promptMessage);
            getOutput(e.getMessage());
        }

    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
