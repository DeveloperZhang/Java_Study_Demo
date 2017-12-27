package com.company.args;

public class ArgsTest {
    public void out(String[] args) {
        System.out.println(args.length);
        for (String arg:args
                ) {
            System.out.println(arg);
        }
    }

}
