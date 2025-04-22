package factory;

import characters.GameCharacter;

public abstract class CharacterFactory {
    public abstract GameCharacter createWarrior();
    public abstract GameCharacter createMage();
}