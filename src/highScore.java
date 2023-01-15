public class highScore {

    public static void main(String[] args) {
        displayHighScorePosition("Alex", calcualteHighScorePosition(1001));
        displayHighScorePosition("Alex", calcualteHighScorePosition(1000));
        displayHighScorePosition("Alex", calcualteHighScorePosition(999));
        displayHighScorePosition("Bob", calcualteHighScorePosition(501));
        displayHighScorePosition("Bob", calcualteHighScorePosition(500));
        displayHighScorePosition("Bob", calcualteHighScorePosition(499));
        displayHighScorePosition("Charlie", calcualteHighScorePosition(101));
        displayHighScorePosition("Charlie", calcualteHighScorePosition(100));
        displayHighScorePosition("Charlie", calcualteHighScorePosition(99));
        displayHighScorePosition("Dave", calcualteHighScorePosition(1));
        displayHighScorePosition("Dave", calcualteHighScorePosition(0));
        displayHighScorePosition("Dave", calcualteHighScorePosition(-1));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calcualteHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

}
