public class Person {
    private String name; // 이름
    private int age; // 나이
    private int cashAmount; // 잔액
    private BankAccount account; // 계정

    public Person(String name, int age) {
        if (age < 0) {
            this.age = 12;
        } else {
            this.age =  age;
        }
        this.name = name;
    }

    public Person(String name , int age, int cashAmount) {
        if(age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }

        if(cashAmount < 0) {
            this.cashAmount = 0;
        }  else {
            cashAmount = age;
        }
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return this.cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
