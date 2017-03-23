import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

class HelloWorldWithLogger {
    
    private static final Logger LOGGER = LogManager.getLogger(HelloWorldWithLogger.class);
    
    public static void main(String[] args) {
        LOGGER.info("Hello world with logger");
    }
}
