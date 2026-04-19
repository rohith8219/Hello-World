public class HelloApp {

    public static void main(String[] args) {
        String finalName;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            
            // UC5 Requirement: Using Enhanced For Loop (for-each)
            for (String val : args) {
                // Add a comma and space before every name except the first one
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(val);
            }
            finalName = nameBuilder.toString();
        } else {
            // Default message if no arguments provided
            finalName = "World";
        }

        System.out.println("Hello " + finalName + "!");
    }
}