import java.util.Objects;

public class Logger {
    private final String[] messages;

    private static final int MAX_MESSAGES = 100;

    private int count;

    private static final Logger instance;
    static{
        instance = new Logger();
    }

    private Logger(){

        this.messages=new String[MAX_MESSAGES];
    }
    public static Logger getInstance(){
        return instance;
    }

    public void add(String message) {
        if (count < MAX_MESSAGES) {
            this.messages[count] = message;
            count++;
        } else {
            System.err.println("Переполнение журнала");
        }
    }

    public void log (String message){
        if (count != 0) { int value=0;
            for (int i=0;i<=count;i++){
                if (Objects.equals(messages[i], message)){
                    value++;
                }
            }
            if(value == 0){
                System.out.println("Запись не обнаружена");
            }else {
                System.out.println("Запись обнаружена "+value+" раз(а)");
            }
        }else System.out.println("Журнал пустой");

    }

}
