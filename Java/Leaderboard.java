public class Leaderboard {
    private int numTeams;
    private static Team[] teams;

    public Leaderboard(int nTeams) {
        numTeams = nTeams;
        teams = new Team[nTeams];
    }

    public static void main(String[] args) {
        Leaderboard l = new Leaderboard(91);
        System.out.println(teams.length);
    }
}

// 2772570n Ashwin Nanda