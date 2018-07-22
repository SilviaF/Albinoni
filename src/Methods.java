public class Methods {

    public static void main(String[] args) {

        int pos;
        pos = calculateHighScorePosition(1500);
        displayHighScorePosition("Silvia", pos);

        pos = calculateHighScorePosition(900);
        displayHighScorePosition("Milena", pos);

        pos = calculateHighScorePosition(400);
        displayHighScorePosition("Peter", pos);

        pos = calculateHighScorePosition(50);
        displayHighScorePosition("Lara", pos);

    }

    public static void displayHighScorePosition (String player, int pos){
        System.out.println(player + " managed to get into position " + pos + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score>=1000) return 1;
        else if (score>=500 && score<1000) return 2;
        else if (score>=100 && score<500) return 3;
        else return 4;
    }

}
