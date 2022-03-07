public class User {

    private final int id;
    private String name;
    private int age;
    private boolean isWorker;

    public User(int id, String name, int age, boolean isWorker) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isWorker = isWorker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void print() {
        System.out.println(getId() + "|" + getName() + "|" + getAge() + "|" + isWorker);
    }
}
