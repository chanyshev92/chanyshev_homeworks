import java.util.Objects;

public class Logger {

    private static final Logger instance;

    static {

        instance = new Logger();

    }

    private Logger() {

    }

    public static Logger getInstance() {

        return instance;

    }

    public void log(String message) {

        if (!Objects.equals(message, "")) {
            System.out.println(message);
        } else System.out.println("Сообщение пустое");

    }

}
