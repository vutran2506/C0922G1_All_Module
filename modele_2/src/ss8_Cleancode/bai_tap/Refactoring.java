package ss8_Cleancode.bai_tap;

public class Refactoring {


    public static String getScore(int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        int number = 3;
        int tempScore;
        if (scorePlayer1 == scorePlayer2) {
            score = new StringBuilder(switch (scorePlayer1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            });
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < number; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score.append("-");
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }

    public static void main(String[] args) {
        System.out.println(getScore(4, 2));
    }
}
