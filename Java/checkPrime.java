
// Import statement:
import java.util.ArrayList;

class checkPrime {

    // Add your methods here:
    public checkPrime() {

    }

    public ArrayList<Integer> primenumbers(int[] array) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean isprime = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isprime = false;
                    break;
                } else {
                    isprime = true;
                }
            }
            if (isprime) {
                primes.add(array[i]);

            }
        }
        return primes;

    }

    public static void main(String[] args) {

        checkPrime pd = new checkPrime();
        int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
        System.out.println(pd.primenumbers(numbers));
    }
}
