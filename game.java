import java.util.Random;

abstract class MainGame {
    abstract void startGame();
}

interface Character {
    void move(int u, int d, int r, int l);

    void attack();
}

interface MainGameBuild {
    void generatemap();

    void generatechar();
}

public class game extends MainGame implements Character, MainGameBuild {

    void startGame() {
        System.out.println("Starting Game .......");

    }

    public void generatemap() {
        System.out.println("The Map is generated.");
    }

    public void generatechar() {
        System.out.println("Character generated.");
    }

    public void move(int u, int d, int r, int l) {
        System.out.println("Character moves:");
        System.out.println("Up by " + u + " steps");
        System.out.println("Down by " + d + " steps");
        System.out.println("Right by " + r + " steps");
        System.out.println("Left by " + l + " steps");
    }

    public void attack() {
        Random rand = new Random();
        int attackPower = rand.nextInt(50) + 1;
        int enemyPower = rand.nextInt(50) + 1;
        System.out.println("Character attacks with power: " + attackPower);
        System.out.println("ENEMY POWER IS:" + enemyPower);

        if (enemyPower > attackPower) {
            System.out.println("You Lose");
        } else {
            System.out.println("You WIN");
        }
    }

    public static void main(String[] args) {
        game myGame = new game();

        myGame.startGame();
        myGame.generatemap();
        myGame.generatechar();
        myGame.move(3, 2, 5, 1);
        myGame.attack();

    }
}
