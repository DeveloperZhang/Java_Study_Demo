import DeadLock.DeadLockDemo;
import SynchronizedDemo.Account;
import SynchronizedDemo.DrawThreadDemo;
import ThreadCommunication.DepositThread;
import ThreadCommunication.DrawThread;
import ThreadDemo.FirstThreadTest;
import ThreadDemo.SecondThreadTest;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//            if (i == 20) {
//                new FirstThreadTest().start();
//                new FirstThreadTest().start();
//            }
//        }

//        for (int i = 0; i < 20; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//            if (i == 10) {
//                SecondThreadTest threadTest = new SecondThreadTest();
//                new Thread(threadTest,"线程1").start();
//                new Thread(threadTest,"线程2").start();
//            }
//        }

//        Account account = new Account("1234567" , 1000);
//        new DrawThreadDemo("A" , account ,800).start();
//        new DrawThreadDemo("B" , account ,800).start();

//        DeadLockDemo deadLockDemo = new DeadLockDemo();
//        new Thread(deadLockDemo).start();
//        deadLockDemo.init();

        ThreadCommunication.Account account = new ThreadCommunication.Account("123456" , 0);
        new DrawThread("取钱者" , account , 800).start();
        new DepositThread("存钱者甲" , account , 800).start();
        new DepositThread("存钱者乙" , account , 800).start();
        new DepositThread("存钱者丙" , account , 800).start();
    }
}
