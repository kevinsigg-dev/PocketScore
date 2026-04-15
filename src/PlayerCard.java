import java.util.Random;

public class PlayerCard {


        private String name;
        private String position;
        private int scoringChance;

        public PlayerCard(String name, String position, int scoringChance) {
            this.name = name;
            this.position = position;
            this.scoringChance = scoringChance;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public int getScoringChance() {
            return scoringChance;
        }

        public boolean attemptGoal() {

            Random random = new Random();
            int number = random.nextInt(100) + 1;

            if (number <= scoringChance) {
                return true;
            } else {
                return false;
            }
        }
    }
}
