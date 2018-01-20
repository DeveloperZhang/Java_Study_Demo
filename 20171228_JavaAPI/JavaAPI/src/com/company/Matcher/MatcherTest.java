package com.company.Matcher;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
    public static void test() {
        String regStr = "Java is very easy!";
        System.out.println("目标字符串是：" + regStr);
        Matcher m = Pattern.compile("\\w+").matcher(regStr);
        while (m.find()) {
            System.out.println(m.group() + "子字符串起始位置：" + m.start() + "，结束为止：" + m.end());
        }

    }
}
