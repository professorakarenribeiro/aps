import factory.*;
import characters.*;

public class Main {
    public static void main(String[] args) {
        CharacterFactory storyFactory = new StoryModeFactory();
        CharacterFactory arenaFactory = new ArenaModeFactory();

        GameCharacter storyWarrior = storyFactory.createWarrior();
        GameCharacter storyMage = storyFactory.createMage();

        GameCharacter arenaWarrior = arenaFactory.createWarrior();
        GameCharacter arenaMage = arenaFactory.createMage();

        storyWarrior.displayInfo();
        storyMage.displayInfo();
        arenaWarrior.displayInfo();
        arenaMage.displayInfo();
    }
}