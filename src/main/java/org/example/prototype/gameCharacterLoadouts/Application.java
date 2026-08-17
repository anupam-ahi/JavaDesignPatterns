package org.example.prototype.gameCharacterLoadouts;

public class Application {
    public static void main(String[] args) throws Exception {
        Loadout warrior = new Loadout();
        warrior.setCharacterType("warrior");
        warrior.setWeapon("Sword");
        warrior.setArmor("Heavy");
        warrior.setHealth(10);
        warrior.setMovementSpeed(20);
        warrior.setSpecialAbility("Sword");
        System.out.println(warrior);


        Loadout archer = warrior.clone();
        System.out.println(archer);
        archer.setHealth(100);
        System.out.println(archer);

        Loadout mage = archer.clone();
        mage.setHealth(12321);
        System.out.println(mage);

    }
}
