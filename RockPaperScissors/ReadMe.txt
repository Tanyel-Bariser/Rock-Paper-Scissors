BUILD INSTRUCTIONS:

Extract this folder containing the project if it is zipped.

This is a Maven project, therefore please install Maven into your IDE before importing this project into your IDE. (M2Eclipse plug in may be helpful in Eclipse)

This project also uses Java 8 including the bundled JavaFX 8 API, so please have the latest JRE 1.8 configured into the project's build path in your IDE. (e(fx)clipse plug in may be helpful for JavaFX 8 configuration in Eclipse)

Dependencies gathered by Maven are via the pom.xml file include:
junit 4.10
testFX 3.1.2
mockito-all 1.9.5

These 3 dependencies are used only to help with unit testing.
Of course you do not have to use Maven and you can manually find and download these 3 jar file dependencies and configure them to the project's build path, in order to run the unit tests, if that's preferred.


RUN INSTRUCTIONS:

The main class to run/play the game is in src/main/java/com/rockpaperscissors/main/RockPaperScissors

The Test Suite to run all unit tests is in src/test/java/com/rockpaperscissors/alltests/AllTests
Once you run AllTests do not move the mouse while it is running as TestFX will cause the unit tests to be aborted.


GAME PLAY INSTRUCTIONS:

The game allows you to play in either Player vs Computer mode where you manually choose ROCK, PAPER or SCISSORS. Or you can play in Computer vs Computer mode where you choose a strategy for the Computer Player to follow to choose a Weapon on your behalf.
A separate score is kept for you, one for playing in Player vs Computer mode and another distinct score for Computer vs Computer mode.


Thank you for reviewing my code.

Tanyel Bariser