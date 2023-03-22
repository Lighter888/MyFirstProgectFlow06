package HW072;
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String winnerName = null;

        while (fighter2.health > 0 && fighter1.health > 0) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health > 0) {
                    fighter1.health -= fighter2.damagePerAttack;
                    winnerName = fighter2.name;
                } else winnerName = fighter1.name;

            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health > 0) {
                    fighter2.health -= fighter1.damagePerAttack;
                    winnerName = fighter1.name;
                } else winnerName = fighter2.name;
            }
        }
        return winnerName;
    }
}