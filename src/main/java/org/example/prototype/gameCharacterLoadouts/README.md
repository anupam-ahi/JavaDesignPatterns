# Exercise: Game Character Loadouts

You are building a Java game where players can create character loadouts.

A loadout can have:

- character type
- weapon
- armor
- health
- special ability
- movement speed

Creating a loadout from scratch can involve a lot of setup.

Now imagine the game already has a few preconfigured loadouts, such as:

- Warrior
- Archer
- Mage

A player should be able to take an existing loadout, make a copy of it, and then change only a few values.

## Example

### Original Warrior

- Weapon: Sword
- Armor: Heavy
- Health: 150
- Ability: Shield Block

### Fast Warrior

- Weapon: Sword
- Armor: Light
- Health: 120
- Ability: Shield Block

## Your Task

Implement this using the Prototype Design Pattern.

## Requirements

- You should be able to create a new loadout by copying an existing one.
- Changing the copied object should not accidentally change the original.
- Avoid recreating all the configuration manually every time.
- Your application code should not need to know all the steps required to construct a loadout.
- Create at least two copies from the same original prototype and modify them differently.

## Small Challenge

Add one field that is itself an object, for example:

```text
Weapon
  name
  damage
```

Then think carefully about this:

If you clone the character and change the cloned character's weapon damage, should the original character's weapon also change?

That question will lead you to one of the most important concepts when learning Prototype: shallow copy vs deep copy.

Build it yourself first and paste the code here when you are done.
