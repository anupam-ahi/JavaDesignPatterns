package org.example.prototype.gameCharacterLoadouts;

public class Loadout implements Cloneable {
    private String characterType;
    private String weapon;
    private String armor;
    private int health;
    private String specialAbility;
    private int movementSpeed;

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Loadout{" +
                "characterType='" + characterType + '\'' +
                ", Weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                ", health=" + health +
                ", specialAbility='" + specialAbility + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    protected Loadout clone() throws CloneNotSupportedException {
        Loadout newLoadout = new Loadout();
        newLoadout.setCharacterType(this.characterType);
        newLoadout.setWeapon(this.weapon);
        newLoadout.setArmor(this.armor);
        newLoadout.setHealth(this.health);
        newLoadout.setSpecialAbility(this.specialAbility);
        newLoadout.setMovementSpeed(this.movementSpeed);
        return newLoadout;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
}
