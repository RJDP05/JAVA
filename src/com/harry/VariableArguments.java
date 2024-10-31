package com.harry;

public class VariableArguments {

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    static int ad(int x, int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add());
        //System.out.println(ad()); Couldn't print bcz ad method needs at least one value
        System.out.println(ad(1,2));
        System.out.println(ad(2,3,4));
        System.out.println(ad(4,5,6));
    }
}
