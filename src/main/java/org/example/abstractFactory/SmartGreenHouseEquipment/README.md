# Exercise: Smart Greenhouse Equipment Families

You are building software for a greenhouse company that supports two greenhouse equipment brands:

- Aeris
- Terrava

Each brand provides a compatible family of devices:

- a humidity sensor
- a watering controller
- a ventilation controller

The important rule is that equipment from one brand should be created and used together. For example, the application should not accidentally combine an Aeris humidity sensor with a Terrava watering controller.

Your task is to design this using the Abstract Factory pattern.

## Requirements

- Both brands must provide all three device types.
- Each device should have one simple behavior, such as reading humidity, watering plants, or ventilating the greenhouse.
- Your greenhouse application should work with either brand without knowing which concrete classes it is using.
- Switching from Aeris equipment to Terrava equipment should require changing as little application code as possible.
- Do not use if/else or switch statements throughout the application to decide which concrete device to instantiate.

## Testing Scenario

Imagine code conceptually doing this:

```text
Start greenhouse using Aeris equipment
-> humidity sensor does its job
-> watering controller does its job
-> ventilation controller does its job

Start greenhouse using Terrava equipment
-> same workflow, different family
```

## Extra Challenge

Make it impossible, or at least difficult, for the main greenhouse logic to accidentally mix devices from different brands.
