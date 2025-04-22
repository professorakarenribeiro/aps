package characters;

public class Warrior implements GameCharacter {
    private String origin;

    public Warrior(String origin) {
        this.origin = origin;
    }

    @Override
    public void displayInfo() {
        System.out.println("🗡️ Guerreiro criado no modo: " + origin);
    }
}