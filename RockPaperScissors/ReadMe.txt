Make sure you have JDK 8 installed as this program uses JavaFX (which is bundled with JDK 8) & some new features introduced in Java 8.

Import the project into your favourite IDE and configure JRE 1.8 to the project's build path.

The unit tests use JUnit and Mockito, so these also need to be configured to the project's build path (mockito-all-1.95.jar is available within the Mockito folder). Unfortunately because this was my first time using JavaFX I was unable to unit test the RPSView class as testing does not work as expected on JavaFX with JUnit/Mockito, however almost none of the game's logic is within the RPSView class, even though it still should have been tested.

After you've compiled the classes, you can run the game by running the main method in the com.rockpaperscissors.main.RockPaperScissors class.

You can choose either Rock, Paper or Scissors yourself in the Player vs Computer mode, or choose a strategy for the computer to choose for you in the Computer vs Computer mode.