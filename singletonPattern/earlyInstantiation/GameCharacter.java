package singletonPattern.earlyInstantiation;

public class GameCharacter {

    // object creation at load time
    private static final GameCharacter gameCharacter = new GameCharacter();

    // prevent to instantiate the class from outside the class
    private GameCharacter() {
    }

    // global point of access to the object created
    public static GameCharacter getGameCharacter() {
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
