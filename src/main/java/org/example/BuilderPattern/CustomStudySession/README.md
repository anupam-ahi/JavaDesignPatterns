# Exercise: Custom Study Session

You are building a Java app where a user can create a custom Study Session.

A study session can have:

- subject
- duration
- difficulty level
- background music on/off
- break interval
- notes enabled/disabled

Some fields are optional, and users may want very different combinations.

## Examples

### Study Session 1

- Subject: Java
- Duration: 60 minutes
- Difficulty: Medium
- Break every: 20 minutes
- Music: Off
- Notes: On

### Study Session 2

- Subject: System Design
- Duration: 90 minutes
- Music: On

## Your Task

Implement this using the Builder Design Pattern.

## Requirements

- Creating a study session should stay readable even when many options are provided.
- Optional values should not force you to create lots of constructors.
- After the object is created, try to make it difficult to accidentally change its configuration.
- Your final object should represent one complete study session.
- Avoid constructors like:

```java
new StudySession("Java", 60, "Medium", false, 20, true);
```

because it is hard to understand what all those values mean.

## Small Challenge

Try to make your final usage read almost like this:

```text
Create a study session
set subject
set duration
set break interval
enable notes
build
```

Do not copy that literally. Decide your own class and method structure.

Once you implement it, paste your Java code here and I will review your approach only, without jumping straight to the solution.
