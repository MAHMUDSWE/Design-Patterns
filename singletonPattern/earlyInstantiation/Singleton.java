package singletonPattern.earlyInstantiation;

public class Singleton {
    public static void main(String[] args) {
        GameCharacter gameCharacter = GameCharacter.getGameCharacter();

        gameCharacter.jumping();
        gameCharacter.walking();
        gameCharacter.running();
    }
}

// Early Instantiation: creation of instance at load time.
