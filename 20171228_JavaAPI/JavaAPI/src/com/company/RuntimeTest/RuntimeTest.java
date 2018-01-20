package com.company.RuntimeTest;

public class RuntimeTest {
    public static void test(){
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors());
    }
}
