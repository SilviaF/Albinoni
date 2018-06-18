public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + "-1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + "*10 = " + result);

        result = result / 5;
        System.out.println(previousResult + "/5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + "%3 = " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;

        if (isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double myDouble = 20;
        double myDouble2 = 80;
        double myResult = (myDouble + myDouble2) * 25;
        System.out.println("Result is " + myResult);

        double remainder = myResult % 40;
        System.out.println("Remainder is " + remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");

        //Challenge
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your second final score was " + finalScore);
        }

    }

}
