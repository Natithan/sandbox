package sandbox;

public class Main {

    public static void main(String[] args) {
        GameCharacter a = new GameCharacter(100);
        a.takeDamage(50);
        System.out.println(a.getHealth());
    }
} 