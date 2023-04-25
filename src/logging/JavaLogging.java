package logging;

import java.util.ResourceBundle;
import java.util.logging.*;

public class JavaLogging {
    static Logger logger = Logger.getLogger("My logger");

    public static void main(String[] args) {
        logger.setUseParentHandlers(false);

//        ResourceBundle resourceBundle = ResourceBundle.getBundle("logger");
//        logger.setResourceBundle(resourceBundle);

        Handler handler = new ConsoleHandler();
        logger.addHandler(handler);

        logger.setLevel(Level.ALL);

        LogRecord logRecord = new LogRecord(Level.CONFIG, "This is how log looks like");

        logger.log(logRecord);
        logger.log(Level.INFO, "this is from log method, not from LogRecord");
    }
}
