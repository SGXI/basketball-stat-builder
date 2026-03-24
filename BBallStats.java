import java.util.Scanner;
import java.util.ArrayList;

class Game{
    String opponents;
    double points, rebounds, assists;
    public Game(String opponents, double points, double rebounds, double assists){
        this.opponents = opponents;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
    }

}

public class BBallStats {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Game> seasonData = new ArrayList<>();

        System.out.print("How many games has this player played: " );
        int gp = scanner.nextInt();
        scanner.nextLine();

        if(gp <= 0){
            System.out.println("\nNo games entered. Exiting......");
            return;
        }

        for(int i = 0; i < gp; i++){
            System.out.println("\n---Entry for game "+ (i+1) + "--- ");
            System.out.print("Opponent name: ");
            String opp = scanner.nextLine();
            System.out.print("Points: "  );
            double p = scanner.nextDouble();
            System.out.print("Rebounds: " );
            double r = scanner.nextDouble();
            System.out.print("Assists: ");
            double a = scanner.nextDouble();
            scanner.nextLine();

            seasonData.add(new Game(opp, p, r, a));
        
        }
        String choice;
        do{
        System.out.println("---Custom Hit Rate Analysis---");
        System.out.println("Enter the benchmarks you want to see the season data against");

        System.out.print("Target Points: ");
        double targetP = scanner.nextDouble();
        
        System.out.print("Target Rebounds: ");
        double targetR = scanner.nextDouble();

        System.out.print("Target Assists: ");
        double targetA = scanner.nextDouble();
        scanner.nextLine();

        displayResults(seasonData, targetP, targetR, targetA);
        System.out.print("\n Would you like to check another benchmark? (y/n): ");
        choice = scanner.nextLine().toLowerCase();

        }while(choice.equals("y"));
        
        System.out.println("\n Analysis Complete Goodbye."); 
    
    }

    public static void displayResults(ArrayList<Game> games, double pGoal, double rGoal, double aGoal) {
        int hits = 0;
        double totalP = 0, totalR = 0, totalA = 0;
        for(Game g: games){
            totalP += g.points;
            totalR += g.rebounds;
            totalA += g.assists;
        if((g.points >= pGoal && g.rebounds >= rGoal && g.assists >= aGoal)){
            hits ++;
        }
        }
        double percentage = ((double) hits/ games.size())*100;
        System.out.println("\n================================");
        System.out.println("SEASON SUMMARY");
        System.out.printf("Averages -> PPG: %.1f | RPG: %.1f | APG: %.1f%n", 
                          (totalP / games.size()), (totalR / games.size()), (totalA / games.size()));
        
        
        System.out.println("\n=====================================");
        System.out.println("HIT RATE ANAYLSIS");
        System.out.printf("Criteria: (%.0f+ PTS & %.0f+ REB &%.0f+ AST) %n", pGoal, rGoal, aGoal);
        System.out.printf("Result: %d out of %d games met this benchmark.%n", hits, games.size());
        System.out.printf("Hit Percentage: %.1f%%%n", percentage);
        System.out.println("========================================");
    }
}

