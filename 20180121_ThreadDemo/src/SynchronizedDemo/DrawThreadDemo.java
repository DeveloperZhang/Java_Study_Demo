package SynchronizedDemo;

public class DrawThreadDemo extends Thread{
    private Account account;
    private double drawAmount;
    public DrawThreadDemo(String name , Account account , double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getDrawAmount() {
        return drawAmount;
    }

    public void setDrawAmount(double drawAmount) {
        this.drawAmount = drawAmount;
    }

//    @Override
//    public void run() {
//        if (account.getBalance() >= drawAmount) {
//            System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            account.setBalance(account.getBalance() - drawAmount);
//            System.out.println("\t余额为：" + account.getBalance());
//        } else {
//            System.out.println(getName() + "取钱失败！余额不足");
//        }
//    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t余额为：" + account.getBalance());
            } else {
                System.out.println(getName() + "取钱失败！余额不足");
            }
        }

    }
}
