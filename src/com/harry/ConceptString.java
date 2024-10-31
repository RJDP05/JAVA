package com.harry;

public class ConceptString {
    public static void main(String[] args) {

        int a = 5;
        float b = 7.576f;
        System.out.printf("The value of a is %d and value of b is %.2f \n",a,b);
        // %d, %f, %s for Strings, %c format specifier
        System.out.format("The value of a is %d and value of b is %8.2f \n",a,b);
        // same as printf
        //x.yf where x is Space and y is number we have to take after .(Dot)


        //String name = new String("RjDP"); no need of this line
        //Strings is a Class but can be used like a Datatype
        //Strings is immutable and can not be changed
        // 012345 index
        // __RjDP
        String name = "  RjDP";  //This is inbuilt
        System.out.println(name);

        // Strings Methods
        // -> Used to operate oon Java String. They can be used to find length of the string,
        //    convert to lowercase etc.
        int value = name.length();
        System.out.println(value);
        
        String ch1 = name.toLowerCase();
        System.out.println(ch1);

        String ch2 = name.toUpperCase();
        System.out.println(ch2);

        System.out.println(name.trim());  // trim space

        System.out.println(name.substring(4)); //beginning from 2 index
        System.out.println(name.substring(2,4)); // (Start,End)

        System.out.println(name.replace('j','a'));
        System.out.println(name.replace("jDP","aAJ"));
        System.out.println(name.replace("j","aAJ"));

        System.out.println(name.startsWith("  R"));
        System.out.println(name.endsWith("jDP"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("jD")); //First index return only

        String rename = "RjDEEPDEEPDEEP";
        System.out.println(rename.indexOf("DEEP",4));
        System.out.println(rename.indexOf("Deep")); // no match return -1

        System.out.println(rename.lastIndexOf("DEEP"));
        System.out.println(rename.lastIndexOf("DEEP",7));

        System.out.println(name.equals("  RjDP"));
        System.out.println(name.equals("  RjdP"));

        System.out.println(name.equalsIgnoreCase("  RJdP"));
        // Ignore Lowercase and Uppercase

        System.out.println("\\ \n \' \t \" ");

    }
}
