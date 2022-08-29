public class BankAccount {
    private int balance; // 계좌 잔고
    private Person owner; // 통장 주인

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return this.owner;
    }

    boolean deposit(int amount) {
        if(amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고 : " + balance + "원 , 현금 : " + owner.getCashAmount()+ "원");
            return false;
        }

        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);

        System.out.println(amount + "원 입금입니다. 잔고 : " + balance + "원 현금 : " + owner.getCashAmount()+ "원");

        return true;
    }
    public boolean deposit(double amount , double exchangeRate) {
        return deposit((int)(amount * exchangeRate));
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if(amount < 0 || amount > balance) {
            success = false;
        } else {
            success = true;
            balance -= amount;
            to.balance += amount;
        }
        System.out.println(success + "- from : " + "[" + owner.getName() + "] to : [" + to.getOwner().getName() + "], amount : [" + amount + "], balance : [" + balance + "]");
        return success;
    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    boolean withdraw(int amount) {
        if(amount < 0 || getBalance() < amount) {
            System.out.println("출금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount()+ "원");
            return false;
        }

        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);

        System.out.println(amount + "원 출금하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount() + "원");

        return true;
    }
}