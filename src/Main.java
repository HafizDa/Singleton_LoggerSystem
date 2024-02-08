public class Main {
    public static void main(String[] args) {
        // Get the instance of the logger
        Logger logger = Logger.getInstance();


        logger.setFileName("log.txt");

        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");


        logger.close();


        System.out.println("Program completed. Check the log file for messages.");
    }
}
