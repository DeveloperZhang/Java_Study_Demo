package com.company.Random;

import java.util.Random;

public class RandomTest {
    public static void test(){
        Random rd = new Random(System.currentTimeMillis());
        System.out.println("currentTimeMillis为种子的随机数为：" + rd.nextInt());
        Random rd1 = new Random(100);
        System.out.println("100为种子的随机数为：" + rd1.nextInt(100));
    }
}
