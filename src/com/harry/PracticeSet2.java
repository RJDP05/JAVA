package com.harry;

public class PracticeSet2 {
    public static void main(String[] args) {
        //Problem 1
        String comm = "GooD DAY";
        comm = comm.toLowerCase();
        System.out.println(comm);

        //Problem 2
        String word = "Now U Can See Me";
        word = word.replace(' ','_');
        System.out.println(word);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a Lot";
        letter = letter.replace("<|name|>","RjDP");
        System.out.println(letter);

        //Problem 4
        String r = "  RjDP,Yo  Boi"; // no Triple Spaces but have Double Spaces
        System.out.println(r.indexOf("  "));
        System.out.println(r.indexOf("   "));

        //Problem 5
        String lt = "GooD!\nKeep Hustling,No Rest\n\t\tThanks";
        System.out.println(lt);

    }
}
