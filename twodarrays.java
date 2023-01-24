import java.util.Arrays;

public class twodarrays {
    public static void main(String[] args) {
        String[][] pop = { { "Ashwin", "nanda" }, { "is" }, { "stuying in" }, { "UoG" }, { "Glasgow" } };
        int[] pop2 = { 1, 2, 3 };
        for (int i = 0; i < pop.length; i++) {
            for (int j = 0; j < pop[i].length; j++) {
                System.out.print(Arrays.toString(pop[j]));
            }
        }

    }

}
