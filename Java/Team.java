public class Team {

    private String name;
    private int numGold;
    private int numSilver;
    private int numBronze;

    public Team(String teamname, int nGold, int nSilver, int nBronze) {
        name = teamname;
        numGold = nGold;
        numSilver = nSilver;
        numBronze = nBronze;
    }

    // setter methods
    public void setName(String teamname) {
        this.name = teamname;
    }

    public void setNumGold(int numGold) {
        this.numGold = numGold;

    }

    public void setNumSilver(int numSilver) {
        this.numSilver = numSilver;
        numSilver++;
    }

    public void setNumBronze(int numBronze) {
        this.numBronze = numBronze;
        numBronze++;
    }

    // overloaded setter methods
    public void setNumGold() {
        numGold++;

    }

    public void setNumSilver() {
        numSilver++;

    }

    public void setNumBronze() {
        numBronze++;

    }

    // getter methods

    public String getName() {
        return this.name;
    }

    public int getNumGold() {
        return this.numGold;
    }

    public int getNumSilver() {
        return this.numSilver;
    }

    public int getNumBronze() {
        return this.numBronze;
    }

    // modifying the toString method so that the output
    // is as desired instead of the memory address
    public String toString() {
        return name + "      " + "|" + "   " + numGold + "|" + "    " + numSilver + "|" + "   " + numBronze;
    }

    public static void main(String[] args) {
        Team test = new Team("orange ", 23, 34, 55);
        test.setNumBronze();
        System.out.println(test);

    }

}
