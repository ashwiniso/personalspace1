public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String n, int np, String rs, String wo) {
        name = n;
        numSpeakers = np;
        regionsSpoken = rs;
        wordOrder = wo;

    }

    public void newline() {
        System.out.println();
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

    public static void main(String[] args) {
        Language hindi = new Language("hindi", 1300000000, "India mainland expect some parts of south India.",
                "subject-verb-object");
        hindi.getInfo();

        Language mayan1 = new Mayan("Chontal", 36810);
        mayan1.getInfo();

        Language sino1 = new SinoTibetan("Mandarin Chinese", 1210000000);
        sino1.getInfo();

        Language sino2 = new SinoTibetan("Burmese", 1310000000);
        sino2.getInfo();

    }
}