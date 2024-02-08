public class Main {
    public static void main(String[] args) {
        // Get the instance of the logger
        Logger logger = Logger.getInstance();

        // Change file name
        logger.setFileName("new_log.txt");

        // Write log messages
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");

        // Remember to close the logger
        logger.close();

        // Output a message to indicate that the program has completed
        System.out.println("Program completed. Check the log file for messages.");
    }
}
