public class Mayan extends Language {
    public Mayan(String n, int ns) {
        super(n, ns, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        newline();
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Fun Fact: " + name + " is an egative language.");
    }
}
