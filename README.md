Build and Run instructions for the Eclipse IDE are followed by Build and Run instructions for Command Line.

BUILD INSTRUCTIONS FOR ECLIPSE IDE:

This is a Maven project, therefore please install Maven into your IDE before importing this project into your IDE. (M2Eclipse plug-in may be helpful in Eclipse)

This project also uses Java 8 including the bundled JavaFX 8 API, so please have the latest JRE 1.8 configured into the project's build path in your IDE. (e(fx)clipse plug-in may be helpful for JavaFX 8 configuration in Eclipse)

Also (in Eclipse) make sure the Java compliance level is set for Java 8. To do this go to Window->Preferences->Java->Compiler then set the "Compiler compliance level:" to 1.8 then go to Window->Preferences->Java->Installed JREs and click the check box labelled jre1.8.0_25 then click OK and do the full build when prompted.

Dependencies gathered by Maven are via the pom.xml file include:
junit 4.10
testFX 3.1.2
mockito-all 1.9.5

These 3 dependencies are used only to help with unit testing.
Of course you do not have to use Maven and you can manually find and download these 3 jar file dependencies and configure them to the project's build path, in order to run the unit tests, if that is preferred.



RUN INSTRUCTIONS FOR ECLIPSE IDE:

The main class to run/play the game is in src/main/java/com/rockpaperscissors/main/RockPaperScissors

The Test Suite to run all unit tests at once is in src/test/java/com/rockpaperscissors/alltests/AllTests
Once you run AllTests do not move the mouse while it is running otherwise TestFX will cause the unit tests to be aborted.






BUILD INSTRUCTIONS FOR COMMAND LINE:

As this is a Maven project please download Maven and follow the set up instructions using the following link:
http://maven.apache.org/download.cgi

You should also have the latest version of Java 8 downloaded and set up in your environment variables.

To compile the project open the command prompt and change the directory so you are in this project's directory then run the following command:

mvn clean install -Dmaven.compiler.source=1.8 -Dmaven.compiler.target=1.8

(Do not move the mouse while the tests are running as TestFX will cause the build to be aborted).



RUN INSTRUCTIONS FOR COMMAND LINE:

To run the main game use the following Maven command in the command prompt:

mvn exec:java -Dexec.mainClass="com.rockpaperscissors.main.RockPaperScissors"

To run all units tests use the following Maven command in the command prompt:

mvn test -Dtest=AllTests

To run only one test use "mvn test -Dtest=" followed by the name of the test, i.e. mvn test -Dtest=HumanPlayerTest





GAME PLAY INSTRUCTIONS:

The game allows you to play in either Player vs Computer mode where you manually choose ROCK, PAPER or SCISSORS. Or you can play in Computer vs Computer mode where you choose a strategy for the Computer Player to follow to choose a Weapon on your behalf.
Two separate scores are kept for you, one for playing in Player vs Computer mode and another distinct score for playing in Computer vs Computer mode.


Tanyel Bariser
