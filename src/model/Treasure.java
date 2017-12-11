package model;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class Treasure extends Module{

    private int prize;
    private String optionMessage;

    public Treasure(int prize) {
        super("Claim your treasure!");
        this.prize = prize;
    }

    //EFFECTS: prints the result of choosing this choice
    public void printOutcome() {
        System.out.println("Your prize is " + prize + " spendibees.");
    }

}
