public class highestmarks {
    public static int highmark(int[] marks) {
        int mark = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > mark) {
                mark = marks[i];
            }

        }
        return mark;
    }

    // sorting the array to get the lowest mark at index 0.
    // 2772570n Ashwin Nanda
    public static int lowestmark(int[] marks) {
        int mark = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    mark = marks[i];
                    marks[i] = marks[j];
                    marks[j] = mark;
                }
            }
        }
        return marks[0];
    }

    // 2772570n Ashwin Nanda
    public static void main(String[] args) {
        int[] marks = { 25, 89, 95, 60, 45, 78 };
        System.out.println(highmark(marks));
        System.out.println(lowestmark(marks));
    }
}
