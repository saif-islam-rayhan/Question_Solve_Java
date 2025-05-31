package bplnilam;
import java.util.*;
public class Team {
    private String teamID;
    private String teamName;
    private String ownerName;
    private List<Player> squad = new ArrayList<>();
    private int localCount = 0;
    private int foreignCount = 0;

    public Team(String teamID, String teamName, String ownerName) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.ownerName = ownerName;
    }

    public String getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<Player> getSquad() {
        return squad;
    }

    public void pickPlayer(Player p) {
        if (p instanceof LocalPlayer) {
            if (localCount < 4) {
                squad.add(p);
                localCount++;
                System.out.printf("%s picks LOCAL → %s%n", ownerName, p);
            }
        } else if (p instanceof ForeignPlayer) {
            if (foreignCount < 4) {
                squad.add(p);
                foreignCount++;
                System.out.printf("%s picks FOREIGN → %s%n", ownerName, p);
            }
        }
    }

    public void validateTeam() {
        if (localCount != 4 || foreignCount != 4) {
            throw new IllegalStateException(
                    String.format("Team \"%s\" (Owner: %s) invalid composition → Local=%d, Foreign=%d",
                            teamName, ownerName, localCount, foreignCount)
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s [ID: %s] (Owner: %s)", teamName, teamID, ownerName);
    }
}
