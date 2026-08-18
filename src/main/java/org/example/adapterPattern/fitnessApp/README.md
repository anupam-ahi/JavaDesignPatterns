# Exercise: Fitness App with an Old Step Counter

You are building a fitness application.

Your app expects every activity tracker to provide data in this form:

- number of steps
- distance in kilometers

Your new trackers already work this way.

But you also need to support an old third-party step counter that gives:

- number of steps
- distance in miles

You cannot modify the old third-party class.

## Your Task

Use the Adapter Design Pattern so that your fitness application can use the old step counter just like any other supported tracker.

## Requirements

- Your main fitness application should work with one common tracker interface.
- The existing/legacy step counter should remain unchanged.
- The application should receive distance in kilometers, even though the old tracker provides miles.
- The conversion logic should not be placed inside the main application.
- Your application should not contain logic like:

```java
if (tracker instanceof OldStepCounter) {
    // special handling
}
```

## Conceptual Flow

```text
Use modern tracker
Steps: 8000
Distance: 6.2 km

Use old tracker
Steps: 7500
Distance: 5.8 km
```

## Small Challenge

After you implement it, ask yourself:

Which class is the application expecting to talk to, and which class has an incompatible interface?

That distinction is basically the core reason the Adapter Pattern exists.

Also, try not to name your classes Adapter, Target, or Adaptee immediately. Give them names that make sense in the fitness domain first. Then see if you can identify which role each class plays in the pattern afterward.
