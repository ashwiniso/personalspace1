public class SinoTibetan extends Language {

    public SinoTibetan(String n, int ns) {
        super(n, ns, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }

    @Override
    public void getInfo() {
        newline();
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

}
