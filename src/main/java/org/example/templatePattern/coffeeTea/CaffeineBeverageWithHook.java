package org.example.templatePattern.coffeeTea;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling Water");
    }
    void pourInCup(){
        System.out.println("Pouring into Cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
