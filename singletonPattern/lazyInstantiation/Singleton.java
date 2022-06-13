package singletonPattern.lazyInstantiation;

public class Singleton {
    public static void main(String[] args) {
        GameCharacter gameCharacter = GameCharacter.getGameCharacter();

        gameCharacter.jumping();
        gameCharacter.walking();
        gameCharacter.running();
    }
}

// Lazy Instantiation: creation of instance at requested time.
