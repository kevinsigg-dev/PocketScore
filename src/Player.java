public class Player {

        private String name;
        private Club club;
        private int goals;

        public Player(String name, Club club) {
            this.name = name;
            this.club = club;
            this.goals = 0;
        }

        public String getName() {
            return name;
        }

        public Club getClub() {
            return club;
        }

        public int getGoals() {
            return goals;
        }

        public void scoreGoal() {
            goals++;
        }

        public PlayerCard shoot() {

            // zufälligen Feldspieler aus dem Verein auswählen
            PlayerCard shooter = club.getRandomFieldPlayer();

            return shooter;
        }
    }
