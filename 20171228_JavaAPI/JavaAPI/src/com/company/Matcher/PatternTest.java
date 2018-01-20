package com.company.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void test(){
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaab");
        boolean b = m.matches();
        System.out.println("result is:" + b);

        boolean b1 = Pattern.matches("a*b","aaaaaab");
        System.out.println("result is:" + b1);
    }
}
