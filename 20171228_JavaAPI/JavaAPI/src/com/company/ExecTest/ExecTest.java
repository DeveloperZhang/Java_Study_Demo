package com.company.ExecTest;

import java.io.IOException;

public class ExecTest {
    public static void test(){
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
