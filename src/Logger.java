import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        // Set a default file name
        fileName = "default_log.txt";
        try {
            // Initialize the BufferedWriter
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception gracefully (you might want to log it or throw a custom exception)
        }
    }

    // Public method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Public method to set the file name dynamically
    public void setFileName(String newFileName) {
        try {
            // Close the current file
            writer.close();
            // Open a new file with the specified name
            writer = new BufferedWriter(new FileWriter(newFileName, true));
            fileName = newFileName;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception gracefully
        }
    }

    // Public method to write log messages to the file
    public void write(String message) {
        try {
            // Write the message on a new line
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception gracefully
        }
    }

    // Public method to close the logger (make sure to call this when done)
    public void close() {
        try {
            // Close the BufferedWriter
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception gracefully
        }
    }
}
