package org.example.templatePattern.coffeeTea;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar in the milk");
    }

    private void pourInCup() {
        System.out.println("pouring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("dripping coffee through the filter");
    }

    public void boilWater(){
        System.out.println("boiling water");
        
    }
}
