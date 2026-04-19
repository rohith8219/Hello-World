public class HelloApp {

    public static void main(String[] args) {
        String finalNames;

        // Check if arguments are provided
        if (args.length > 0) {
            // UC7 Requirement: Efficiently concatenate using String.join()
            // This replaces the manual loops and substring methods from UC5 and UC6
            finalNames = String.join(", ", args);
        } else {
            // Default greeting
            finalNames = "World";
        }

        // Print the result
        System.out.println("Hello " + finalNames + "!");
    }
}