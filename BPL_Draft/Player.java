package bplnilam;

public abstract class Player {
    private String iccid;
    private String name;
    private String nationality;
    private int jerseyNumber;
    private String role;

    public Player(String iccid, String name, String nationality,
                  int jerseyNumber, String role) {
        this.iccid = iccid;
        this.name = name;
        this.nationality = nationality;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public String getIccid() {
        return iccid;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {

        return String.format("%s (%s, #%d - %s)",
                name, nationality, jerseyNumber, role);
    }
}
