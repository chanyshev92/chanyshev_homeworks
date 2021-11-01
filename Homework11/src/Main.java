public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger2.add("Все хорошо");
        logger1.add("Ошибка1");
        logger2.add("Предупреждение2");
        logger2.add("Приказ66");

        logger1.log("Все хорошо");
        logger2.log("Error");

    }
}
