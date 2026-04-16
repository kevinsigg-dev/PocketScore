import java.util.Random;
import java.util.Scanner;

public class Game {

            private Player player1;
            private Player player2;
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

            public void startGame() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Spieler 1 Name:");
                String name1 = scanner.nextLine();

                System.out.println("Spieler 2 Name:");
                String name2 = scanner.nextLine();

                System.out.println("Verein für Spieler 1 wählen:");
                System.out.println(RED + "1 " + "FC Bayern" + RESET);
                System.out.println(RED + "2 " + "Real Madrid" + RESET);
                System.out.println(RED + "3 " + "Liverpool FC" + RESET);
                System.out.println(RED + "4 " + "VfB Stuttgart" + RESET);

                int choice1 = scanner.nextInt();
                Club club1 = createClub(choice1);

                System.out.println("Verein für Spieler 2 wählen:");
                int choice2 = scanner.nextInt();
                Club club2 = createClub(choice2);

                player1 = new Player(name1, club1);
                player2 = new Player(name2, club2);

                playMatch();
            }

            private Club createClub(int choice) {

                if(choice == 1) return new Club("FC Bayern");
                if(choice == 2) return new Club("Real Madrid");
                if(choice == 3) return new Club("Liverpool FC");
                if(choice == 4) return new Club("VfB Stuttgart");

                return new Club("FC Bayern");
            }

            private void playMatch() {

                Random random = new Random();

                Player currentPlayer;

                if(random.nextBoolean()) {
                    currentPlayer = player1;
                } else {
                    currentPlayer = player2;
                }

                System.out.println(currentPlayer.getName() + " hat Anspiel!");

                for(int round = 1; round <= 6; round++) {

                    System.out.println("\n--- Runde " + round + " ---");

                    playTurn(player1);
                    playTurn(player2);
                }

                showResult();
            }

            private void playTurn(Player player) {

                PlayerCard shooter = player.shoot();

                System.out.println(player.getName() + " hat Ballbesitz!   " + shooter.getName() + " dringt in den Strafraum ein und schießt!");

                waitForEnter();

                if(shooter.attemptGoal()) {

                    player.scoreGoal();

                    System.out.println(RED + "TOOOR!!!" + RESET);

                } else {

                    System.out.println(RED + "Kein Tor." + RESET);
                }
            }

            private void showResult() {

                System.out.println("\nEndstand:");

                System.out.println(player1.getName() + ": " + player1.getGoals());
                System.out.println(player2.getName() + ": " + player2.getGoals());

                if(player1.getGoals() > player2.getGoals()) {

                    System.out.println(player1.getName() + " gewinnt!");

                } else if(player2.getGoals() > player1.getGoals()) {

                    System.out.println(player2.getName() + " gewinnt!");

                } else {

                    System.out.println("Unentschieden!");
                }
            }

    private void waitForEnter() {

        System.out.println("\nDrücke ENTER um fortzufahren...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }

            public static void main(String[] args) {

                Game game = new Game();
                game.startGame();
            }
        }
