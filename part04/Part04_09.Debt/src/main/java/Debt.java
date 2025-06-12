public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double InitialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = InitialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        balance = balance * interestRate;
    }
}
