package main.java.hw13Burgers;

public class Burger {
    boolean bun;
    boolean cheese;
    boolean meat;
    boolean secondMeat;
    boolean greenery;
    boolean mayonnaise;

    public Burger(boolean bun, boolean cheese, boolean meat, boolean secondMeat, boolean greenery, boolean mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.secondMeat = secondMeat;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("This is burger with double meat. Composition  of this burger --> " + "Bun: " + this.bun + "; Cheese: " + this.cheese + "; Meat: " + this.meat + "; Second Meat: " + this.secondMeat + "; Greenery: " + this.greenery + "; Mayonnaise: " + this.mayonnaise);
    }

    public Burger(boolean bun, boolean cheese, boolean meat, boolean greenery, boolean mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        this.meat = meat;
        System.out.println("This is original burger. Composition  of this burger --> " + "Bun: " + this.bun + "; Cheese: " + this.cheese + "; Meat: " + this.meat + "; Greenery: " + this.greenery + "; Mayonnaise: " + this.mayonnaise);
    }

    public Burger(boolean bun, boolean cheese, boolean meat, boolean greenery) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.greenery = greenery;
        System.out.println("This is diet burger. Composition  of this burger --> " + "Bun: " + this.bun + "; Cheese: " + this.cheese + "; Meat: " + this.meat +  "; Greenery: " + this.greenery);
    }
}
