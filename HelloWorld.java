public class HelloApp {

    public static void main(String[] args) {
        String finalOutput;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            // UC6 Requirement: Add names and delimiters in the loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // At this point, nameBuilder looks like: "Amit, Rahul, "
            // UC6 Requirement: Use substring to remove the trailing ", "
            String tempString = nameBuilder.toString();
            finalOutput = tempString.substring(0, tempString.length() - 2);
        } else {
            finalOutput = "World";
        }

        System.out.println("Hello " + finalOutput + "!");
    }
}