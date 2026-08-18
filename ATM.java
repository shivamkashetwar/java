

package bank;

public class ATM {

    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " + balance);
    }

    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("\nWithdrawing Amount : " + withdrawAmount);

        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and card.");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }

        return balance;
    }

    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("\nDepositing Amount : " + depositAmount);

        balance = balance + depositAmount;
        System.out.println("Deposit successful.");
        displayBalance(balance);

        return balance;
    }

    public static void main(String args[]) {
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;

        displayBalance(balance);
        balance = amountWithdrawing(balance, withdrawAmount);
        balance = amountDepositing(balance, depositAmount);
    }
}