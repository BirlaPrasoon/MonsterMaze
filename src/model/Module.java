package model;

public abstract class Module {
    protected String optionMessage;

    Module(String optionMessage){
        this.optionMessage = optionMessage;
    }

    //EFFECTS: prints a message representing this possible next choice
    public void printOptionMessage() {
        System.out.println(optionMessage);
    }

}
