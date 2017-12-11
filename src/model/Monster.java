package model;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class Monster extends Module{

    private Treasure treasure;
    private String optionMessage;

    public Monster() {
        super("Fight a monster.");
        treasure = null;
    }

    //MODIFIES: this
    //EFFECTS: sets the treasure to t
    public void setTreasure(Treasure t) {
        this.treasure = t;
    }

    //EFFECTS: prints the result of choosing this choice
    public void printOutcome() {
        if (treasure == null) {
            System.out.println("Ha! I killed you!");
        } else {
            System.out.println("Ahh! You killed me!");
            treasure.printOutcome();
        }
    }

}
