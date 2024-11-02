package com.codingwallahsir;

public class StaticInitializationBlock {
    // This program will successfully run prior to JDK 7
    static {
        System.out.println("class without a main method");
        System.exit(0);
    }
}
