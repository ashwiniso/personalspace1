//example 7
public class interest {
    public static double interest(double deposit, double rate) {
        double myInterest = deposit * rate / 100;
        return myInterest;

    }

    public static void main(String[] args) {
        double rate = 15;
        double myBalance = 200;
        double yourBalance = 150;
        System.out.println("The interest I have earned is " + interest(myBalance, rate));
        System.out.println("The interest you have earned is " + interest(yourBalance, rate));
    }

}
