package singletonPattern.lazyInstantiation;

public class GameCharacter {

    // object creation at load time
    private static GameCharacter gameCharacter;

    // prevent to instantiate the class from outside the class
    private GameCharacter() {
    }

    // global point of access to the object created
    public static GameCharacter getGameCharacter() {
        if (gameCharacter == null) {
            synchronized (GameCharacter.class) {
                if (gameCharacter == null) {
                    gameCharacter = new GameCharacter();
                }
            }
        }

        return gameCharacter;
    }

    public void running() {
        System.out.println("Character Running.....");
    }

    public void walking() {
        System.out.println("Character walking.....");
    }

    public void jumping() {
        System.out.println("Character jumping.......");
    }
}
