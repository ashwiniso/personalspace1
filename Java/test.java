import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] imageData = { { 100, 90, 255, 80, 70, 255, 60, 50 },
                { 255, 10, 5, 255, 10, 5, 255, 255 },
                { 255, 255, 255, 0, 255, 255, 255, 75 },
                { 255, 60, 30, 0, 30, 60, 255, 255 } };

        int[][] newImage = new int[4][6];

        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (j == 6 || j == 7) {
                } else {
                    newImage[i][j] = imageData[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(newImage));
    }
}