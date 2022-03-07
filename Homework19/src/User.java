public class User {

    private String name;
    private int age;
    private boolean isWorker;

    public User(String name, int age, boolean isWorker) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

}
