import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HW30MainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BlackBox blackBox = new BlackBox();

        // Fulfilling the set + trying to catch an exception
        try {
            System.out.println("How long you want the set to be?");
            Integer setLength = Integer.parseInt(reader.readLine());
            int counter = 0;
            while (counter < setLength) {
                System.out.println("Provide a number:");
                Integer number = Integer.parseInt(reader.readLine());
                if (blackBox.getIntegerHashSet().contains(number)) {
                    continue;
                } else {
                    blackBox.getIntegerHashSet().add(number);
                    counter++;
                }
            }
            System.out.println(blackBox.getIntegerHashSet());


            // Searching for number in the set
            System.out.println("What number do you want to find?");
            blackBox.setK(Integer.parseInt(reader.readLine()));
            ArrayList<Integer> integerArrayList = new ArrayList<>(blackBox.getIntegerHashSet());
            if (blackBox.getIntegerHashSet().contains(blackBox.getK())) {
                System.out.println("The position of " + blackBox.getK() + " is #" +
                        (integerArrayList.indexOf(blackBox.getK()) + 1) + " in the sorted set.");
            } else {
                System.out.println("Provided number wasn't found in the set.");
            }

            // Summarise neighboring elements
            System.out.println("\nSummarising neighboring elements.");
            System.out.println("Initial: " + blackBox.getIntegerHashSet());
            int a = 0;
            int b = 1;
            while (integerArrayList.size() != 1) {
                if (a > integerArrayList.size()) {
                    break;
                } else {
                    if (b > integerArrayList.size() - 1) {
                        a = 0;
                        b = 1;
                    } else {
                        int sum = integerArrayList.get(a) + integerArrayList.get(b);
                        integerArrayList.set(a, sum);
                        integerArrayList.remove(b);
                        a++;
                        b++;
                        System.out.println(integerArrayList);
                        integerArrayList.trimToSize();
                    }
                    integerArrayList.iterator();
                }
            }
        } catch (Exception exception) {
            System.out.println("Incorrect data type!");
        }
    }
}
