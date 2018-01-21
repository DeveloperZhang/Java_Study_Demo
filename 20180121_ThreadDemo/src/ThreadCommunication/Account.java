package ThreadCommunication;

public class Account {
    private String accountNo;
    private double balance;
    private boolean flag = false;
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

    public synchronized void draw(double drawAmount) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
            balance -= drawAmount;
            System.out.println("账户余额为：" + balance);
            flag = false;
            notifyAll();
        }
    }

    public synchronized void deposit(double drawAmount) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "存钱：" + drawAmount);
            balance += drawAmount;
            System.out.println("账户余额为：" + balance);
            flag = true;
            notifyAll();
        }
    }

}
