
package bplnilam;

import java.util.*;

public class BPLNilamMain {
    public static void main(String[] args) {
        // 1) Create 30 Local players
        List<Player> localPlayers = new ArrayList<>();
        localPlayers.add(new LocalPlayer("L001", "Mashrafe Mortaza",   "BD",  18, "Bowler"));
        localPlayers.add(new LocalPlayer("L002", "Tamim Iqbal",       "BD",   13, "Batsman"));
        localPlayers.add(new LocalPlayer("L003", "Mushfiqur Rahim",   "BD",  10, "Wicket-keeper"));
        localPlayers.add(new LocalPlayer("L004", "Shakib Al Hasan",   "BD",  75, "All-rounder"));
        localPlayers.add(new LocalPlayer("L005", "Mahmudullah Riyad", "BD",  23, "Batsman"));
        localPlayers.add(new LocalPlayer("L006", "Soumya Sarkar",     "BD",  30, "Batsman"));
        localPlayers.add(new LocalPlayer("L007", "Tamim Salah Uddin", "BD",   7, "All-rounder"));
        localPlayers.add(new LocalPlayer("L008", "Liton Das",         "BD",   9, "Wicket-keeper"));
        localPlayers.add(new LocalPlayer("L009", "Anamul Haque",      "BD",  22, "Batsman"));
        localPlayers.add(new LocalPlayer("L010", "Najmul Hossain",    "BD",  25, "All-rounder"));
        localPlayers.add(new LocalPlayer("L011", "Nazmul Hossain Shanto", "BD", 16, "Batsman"));
        localPlayers.add(new LocalPlayer("L012", "Mehidy Hasan",      "BD",   8, "All-rounder"));
        localPlayers.add(new LocalPlayer("L013", "Taijul Islam",      "BD",  21, "Bowler"));
        localPlayers.add(new LocalPlayer("L014", "Mustafizur Rahman", "BD",  90, "Bowler"));
        localPlayers.add(new LocalPlayer("L015", "Taskin Ahmed",      "BD",  11, "Bowler"));
        localPlayers.add(new LocalPlayer("L016", "Habibul Bashar",    "BD",  98, "Batsman"));
        localPlayers.add(new LocalPlayer("L017", "Jamal Bhai",        "BD",   5, "All-rounder"));
        localPlayers.add(new LocalPlayer("L018", "Rony Talukdar",     "BD",  12, "Batsman"));
        localPlayers.add(new LocalPlayer("L019", "Shahriar Nafees",   "BD",  70, "Batsman"));
        localPlayers.add(new LocalPlayer("L020", "Jaker Ali",         "BD",  17, "Wicket-keeper"));
        localPlayers.add(new LocalPlayer("L021", "Towhid Hridoy",     "BD",  32, "Batsman"));
        localPlayers.add(new LocalPlayer("L022", "Hridoy Islam",      "BD",   6, "Batsman"));
        localPlayers.add(new LocalPlayer("L023", "Afif Hossain",      "BD",  28, "All-rounder"));
        localPlayers.add(new LocalPlayer("L024", "Riyad Khan",        "BD",  41, "All-rounder"));
        localPlayers.add(new LocalPlayer("L025", "Sayem Alam",        "BD",  54, "All-rounder"));
        localPlayers.add(new LocalPlayer("L026", "Anwar Hossain",     "BD",  15, "Bowler"));
        localPlayers.add(new LocalPlayer("L027", "Abu Jayed",         "BD",  29, "Bowler"));
        localPlayers.add(new LocalPlayer("L028", "Shoriful Islam",    "BD",  19, "Bowler"));
        localPlayers.add(new LocalPlayer("L029", "Towhid Hridoy Jr",  "BD",  35, "All-rounder"));
        localPlayers.add(new LocalPlayer("L030", "Mehidy Hasan Jr",   "BD",  44, "All-rounder"));

        // 2) Create 30 Foreign players
        List<Player> foreignPlayers = new ArrayList<>();
        foreignPlayers.add(new ForeignPlayer("F001", "David Warner",      "AUS",  31, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F002", "Glenn Maxwell",     "AUS",  35, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F003", "Marcus Stoinis",    "AUS",  17, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F004", "Pat Cummins",       "AUS",   8, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F005", "Steve Smith",       "AUS",  14, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F006", "Andre Russell",     "WI",   29, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F007", "Nicholas Pooran",   "WI",  11, "Wicket-keeper"));
        foreignPlayers.add(new ForeignPlayer("F008", "Chris Gayle",       "WI",  45, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F009", "Sunil Narine",      "WI",   1, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F010", "Kieron Pollard",    "WI",  55, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F011", "Brendon McCullum",  "NZ",   7, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F012", "Trent Boult",       "NZ",  27, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F013", "Kane Williamson",   "NZ",  22, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F014", "Martin Guptill",    "NZ",   3, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F015", "Tim Southee",       "NZ",   14, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F016", "Ben Stokes",        "ENG",  55, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F017", "Jos Buttler",       "ENG",   7, "Wicket-keeper"));
        foreignPlayers.add(new ForeignPlayer("F018", "Jonny Bairstow",    "ENG",  51, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F019", "Jofra Archer",      "ENG",  21, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F020", "Chris Woakes",      "ENG",  11, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F021", "AB de Villiers",    "RSA",  17, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F022", "Kagiso Rabada",     "RSA",   5, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F023", "Faf du Plessis",    "RSA",  22, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F024", "David Miller",      "RSA",   5, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F025", "Chris Morris",      "RSA",   4, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F026", "Lasith Malinga",    "SL",   99, "Bowler"));
        foreignPlayers.add(new ForeignPlayer("F027", "Kumar Sangakkara",  "SL",   11, "Wicket-keeper"));
        foreignPlayers.add(new ForeignPlayer("F028", "Tillakaratne Dilshan", "SL", 17, "Batsman"));
        foreignPlayers.add(new ForeignPlayer("F029", "Thisara Perera",    "SL",  27, "All-rounder"));
        foreignPlayers.add(new ForeignPlayer("F030", "Lasith Malinga",    "SL",   99, "Bowler")); // repeated intentionally for 30th

        // 3) Shuffle each list separately
        Collections.shuffle(localPlayers, new Random());
        Collections.shuffle(foreignPlayers, new Random());

        // 4) Create 6 teams
        List<Team> teams = List.of(
                new Team("T01", "Dhaka Dynamos",          "Alice"),
                new Team("T02", "Chittagong Challengers", "Bob"),
                new Team("T03", "Khulna Tigers",          "Charlie"),
                new Team("T04", "Sylhet Strikers",        "David"),
                new Team("T05", "Rangpur Riders",         "Eva"),
                new Team("T06", "Rajshahi Royals",        "Frank")
        );

        // 5) Round-robin assignment for 4 locals each
        int localIndex = 0;
        for (int round = 0; round < 4; round++) {
            for (Team t : teams) {
                t.pickPlayer(localPlayers.get(localIndex++));
            }
        }

        // 6) Round-robin assignment for 4 foreigners each
        int foreignIndex = 0;
        for (int round = 0; round < 4; round++) {
            for (Team t : teams) {
                t.pickPlayer(foreignPlayers.get(foreignIndex++));
            }
        }

        // 7) Validate and print each team
        System.out.println("\n=== FINAL TEAMS ===");
        for (Team t : teams) {
            try {
                t.validateTeam();
                System.out.println("\n" + t);
                for (Player p : t.getSquad()) {
                    System.out.println("  • " + p);
                }
            } catch (IllegalStateException ex) {
                System.out.println("\n" + t + " validation failed: " + ex.getMessage());
            }
        }
    }
}

