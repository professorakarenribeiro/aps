package factory;

import characters.*;

public class StoryModeFactory extends CharacterFactory {
    @Override
    public GameCharacter createWarrior() {
        return new Warrior("Modo História");
    }

    @Override
    public GameCharacter createMage() {
        return new Mage("Modo História");
    }
}