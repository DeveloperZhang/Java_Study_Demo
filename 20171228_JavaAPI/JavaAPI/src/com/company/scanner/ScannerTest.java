package com.company.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void test(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}
