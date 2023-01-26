import java.util.*;

public class test {

    public static void main(String[] args) {
        int[][] intMatrix = {
                { 1, 1, 1, 1, 1 },
                { 2, 4, 6, 8, 0 },
                { 9, 8, 7, 6, 5 } };

        intMatrix[1][1] = 0;

        int[][] subMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                subMatrix[i][j] = intMatrix[i][j] * 5;
            }
        }

        System.out.println(Arrays.deepToString(subMatrix));

    }
}
