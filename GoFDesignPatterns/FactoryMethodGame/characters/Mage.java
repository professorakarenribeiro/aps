package characters;

public class Mage implements GameCharacter {
    private String origin;

    public Mage(String origin) {
        this.origin = origin;
    }

    @Override
    public void displayInfo() {
        System.out.println("🪄 Mago criado no modo: " + origin);
    }
}