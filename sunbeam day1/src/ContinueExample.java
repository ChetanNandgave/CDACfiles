
public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Skipping number " + i);
                continue;  // Skip the current iteration
            }

            System.out.println("Number: " + i);
        }
    }
}
