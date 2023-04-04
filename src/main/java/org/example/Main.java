package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> bob = new HashMap<>();
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";

        char[] charactersInString = quote.toCharArray();

        for (char letta : charactersInString) {
            if (bob.containsKey(letta)) {
                bob.put(letta, bob.get(letta)+1);
            }else {
                bob.put(letta, 1);
            }


        }

    System.out.println(bob);

        //...for(HashMap.Entry<Character, Integer> entry : bob.entrySet().entrySet()) {
        //    System.out.println(bob);
        //}

    }

}

