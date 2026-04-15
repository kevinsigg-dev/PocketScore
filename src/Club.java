import java.util.ArrayList;
import java.util.Random;

public class Club {


    }import ArrayList;
     import java.util.Random;

    public class Club {

        private String name;
        private ArrayList<PlayerCard> squad;

        public Club(String name) {
            this.name = name;
            this.squad = new ArrayList<>();
            generateSquad();
        }

        public String getName() {
            return name;
        }

        public ArrayList<PlayerCard> getSquad() {
            return squad;
        }

        private void generateSquad() {

            if(name.equals("FC Bayern")) {
                createBayernSquad();
            }

            else if(name.equals("Real Madrid")) {
                createMadridSquad();
            }

            else if(name.equals("Liverpool FC")) {
                createLiverpoolSquad();
            }

            else if(name.equals("VfB Stuttgart")) {
                createStuttgartSquad();
            }
        }

        public PlayerCard getRandomFieldPlayer() {

            Random random = new Random();

            int index = random.nextInt(10) + 1;

            return squad.get(index);
        }

        private void createBayernSquad() {

            squad.add(new PlayerCard("Manuel Neuer", "Goalkeeper", 0));

            squad.add(new PlayerCard("Alphonso Davies", "Defender", 40));
            squad.add(new PlayerCard("Min-jae Kim", "Defender", 40));
            squad.add(new PlayerCard("Dayot Upamecano", "Defender", 40));
            squad.add(new PlayerCard("Jonathan Tah", "Defender", 40));

            squad.add(new PlayerCard("Joshua Kimmich", "Midfielder", 60));
            squad.add(new PlayerCard("Leon Goretzka", "Midfielder", 60));
            squad.add(new PlayerCard("Jamal Musiala", "Midfielder", 60));

            squad.add(new PlayerCard("Harry Kane", "Striker", 70));
            squad.add(new PlayerCard("Serge Gnabry", "Striker", 70));
            squad.add(new PlayerCard("Michael Olise", "Striker", 70));
        }

        private void createMadridSquad() {

            squad.add(new PlayerCard("Thibaut Courtois", "Goalkeeper", 0));

            squad.add(new PlayerCard("Dani Carvajal", "Defender", 40));
            squad.add(new PlayerCard("Antonio Rudiger", "Defender", 40));
            squad.add(new PlayerCard("David Alaba", "Defender", 40));
            squad.add(new PlayerCard("Ferland Mendy", "Defender", 40));

            squad.add(new PlayerCard("Federico Valverde", "Midfielder", 60));
            squad.add(new PlayerCard("Jude Bellingham", "Midfielder", 60));
            squad.add(new PlayerCard("Eduardo Camavinga", "Midfielder", 60));

            squad.add(new PlayerCard("Vinicius Jr", "Striker", 70));
            squad.add(new PlayerCard("Rodrygo", "Striker", 70));
            squad.add(new PlayerCard("Kylian Mbappe", "Striker", 70));
        }

        private void createLiverpoolSquad() {

            squad.add(new PlayerCard("Alisson Becker", "Goalkeeper", 0));

            squad.add(new PlayerCard("Trent Alexander-Arnold", "Defender", 40));
            squad.add(new PlayerCard("Virgil van Dijk", "Defender", 40));
            squad.add(new PlayerCard("Ibrahima Konate", "Defender", 40));
            squad.add(new PlayerCard("Andrew Robertson", "Defender", 40));

            squad.add(new PlayerCard("Alexis Mac Allister", "Midfielder", 60));
            squad.add(new PlayerCard("Dominik Szoboszlai", "Midfielder", 60));
            squad.add(new PlayerCard("Curtis Jones", "Midfielder", 60));

            squad.add(new PlayerCard("Mohamed Salah", "Striker", 70));
            squad.add(new PlayerCard("Hugo Ekitiké", "Striker", 70));
            squad.add(new PlayerCard("Florian Wirtz", "Striker", 70));
        }

        private void createStuttgartSquad() {

            squad.add(new PlayerCard("Alexander Nubel", "Goalkeeper", 0));

            squad.add(new PlayerCard("Josha Vagnoman", "Defender", 40));
            squad.add(new PlayerCard("Jedd Chabot", "Defender", 40));
            squad.add(new PlayerCard("Ramon Hendriks", "Defender", 40));
            squad.add(new PlayerCard("Maximilian Mittelstadt", "Defender", 40));

            squad.add(new PlayerCard("Angelo Stiller", "Midfielder", 60));
            squad.add(new PlayerCard("Chris Fuhrich", "Midfielder", 60));
            squad.add(new PlayerCard("Jamie Leweling", "Midfielder", 60));

            squad.add(new PlayerCard("Deniz Undav", "Striker", 70));
            squad.add(new PlayerCard("El Khanouss", "Striker", 70));
            squad.add(new PlayerCard("Ermedin Demirovic", "Striker", 70));
        }
    }
