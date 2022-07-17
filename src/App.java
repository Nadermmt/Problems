public class App {
    public static void main(String[] args) throws Exception {
        MaxSum maxSum = new MaxSum();
        System.out.println("Max Sum = " + maxSum.getCount());

        MissingLetters missingLetters = new MissingLetters();
        System.out.println("Missing Letters = " + missingLetters.GetMissingLetters("acdef hijk lmnopqrstuvwxz"));
    }
}
