public class HelloApp {

    public static void main(String[] args) {

        String name;

        // Check if arguments are provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma if not the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        } else {
            // Default value if no arguments
            name = "World";
        }

        // Print the greeting
        System.out.println("Hello " + name);
    }
}