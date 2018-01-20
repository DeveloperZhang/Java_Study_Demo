package com.company.System;

import java.util.Map;

public class SystemTest {
    public static void test(){
        Map<String,String> env = System.getenv();
        for (String name :
                env.keySet()) {
            System.out.println(name + "--->" + env.get(name));
        }
    }
}
