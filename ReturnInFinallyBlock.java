public class CodeIssuesExample {

    public static void main(String[] args) {
        // Unused local variable issue
        int unusedVariable =true;

        // Unconditional if statement issue
        boolean condition = true;

        // Unconditional if statement issue
        boolean anotherCondition = false;
        if (anotherCondition) {
            logger.info("This condition always executes as well.");
        }

       
    }
}
