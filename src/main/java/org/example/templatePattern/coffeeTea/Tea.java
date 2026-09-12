package org.example.templatePattern.coffeeTea;

public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("adding lemon ");

    }

    private void pourInCup() {
        System.out.println("pouring into cup");
    }

    private void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    private void boilWater() {
        System.out.println("boiling water");

    }
}
