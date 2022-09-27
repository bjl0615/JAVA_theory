public class MinimumBalanceAccount extends BankAccount{
    private int minimum;

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    public boolean withdraw(int amount) {
        if(getBalance() - amount < minimum) {
            System.out.println("적어도 " + minimum + "원은 남겨야 합니다.");
        }

        setBalance(getBalance() - amount);
        return true;
    }
}
