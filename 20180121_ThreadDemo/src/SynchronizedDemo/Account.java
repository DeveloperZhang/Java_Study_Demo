package SynchronizedDemo;

public class Account {
    private String accountNo;
    private double balance;
    public Account(String accountNo , double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int hashCode(){
        return accountNo.hashCode();
    }

    public boolean equals(Object object){
        if (this == object)
            return true;
        else if (object !=null && object.getClass() == Account.class){
            Account target = (Account)object;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }

}
