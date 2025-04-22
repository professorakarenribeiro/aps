package factory;

import characters.*;

public class ArenaModeFactory extends CharacterFactory {
    @Override
    public GameCharacter createWarrior() {
        return new Warrior("Modo Arena");
    }

    @Override
    public GameCharacter createMage() {
        return new Mage("Modo Arena");
    }
}